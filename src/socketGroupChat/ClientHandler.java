package socketGroupChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientHandler implements Runnable{
//    public static List <ClientHandler> clientHandlers = new ArrayList<>();
//    private Socket socket;
//    private BufferedReader bufferedReader;
//    private BufferedWriter bufferedWriter;
//    private String clientUsername;
//    public ClientHandler(Socket socket) {
//        try {
//            this.socket = socket;
//            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            this.bufferedReader = new BufferedReader(new BufferedReader(socket.getOutputStream()));
//            this.clientUsername = bufferedReader.readLine();
//            clientHandlers.add(this);
//            broadcastMessage("server:: "+clientUsername+"has entered the chat!");
//        }catch (IOException e){
//            closeEverything(socket, bufferedReader, bufferedWriter);
//        }
//    }

    @Override
    public void run() {

    }
}
