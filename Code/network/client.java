package Code.network;

import java.net.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private int nopeTiming = 5;

    public client(String address) throws IOException{
        Socket socket = new Socket(address,2048);
        ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());

        ExecutorService threadpool = Executors.newFixedThreadPool(1);
        Runnable receive = new Runnable() {
            @Override
            public void run() {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                while(true){
                    try{
                        String nextMessage = (String) inFromServer.readObject();
                        System.out.println(nextMessage);
                        if(nextMessage.equals("playerTurn") || nextMessage.equals("favor") || nextMessage.equals("defused")){
                            outToServer.writeObject(input.readLine());
                        } else if (nextMessage.equals("<Enter>")) {
                            int timeWaited = 0;
                            while(!input.ready() && timeWaited<(nopeTiming*1000)){
                                Thread.sleep(100);//100 milliseconds is perceived as instant to humans
                                timeWaited += 100;
                            }
                            if(input.ready()){
                                outToServer.writeObject(input.readLine());
                            }else{
                                outToServer.writeObject("");
                            }
                        }
                    } catch (Exception e){

                    }
                }
            }
        };

        threadpool.execute(receive);
    }
}
