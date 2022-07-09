package Server;

import Const.PORT;
import Entity.Food;
import Handler.FoodHandler;
import InsertData.InsertFoodOrder;
import InsertData.InsertUserName;
import Entity.User;
import client.Client;
import com.google.gson.Gson;
import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Server {
    public static void main(String args[]) {
//        FoodHandler.getAllFood();
//        InsertFoodOrder.InputFoodOrderDataFromKeyBoard();
//        InsertUserName.insertNameOfClient();

        ServerSocket serverSocket = null;
        User user =  new User();
        try{
            serverSocket = new ServerSocket(PORT.PORT);
            serverSocket.setReuseAddress(true);
            while (true){
                Socket client = serverSocket.accept();
                System.out.println("New " + user.getUserName() +" connected"
                        + client.getInetAddress()
                        .getHostAddress());
                ClientHandler clientHandler = new ClientHandler(client);
                new Thread(clientHandler).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class ClientHandler implements Runnable{
        private final Socket clientSocket;

        // Constructor
        public ClientHandler(Socket socket)
        {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            PrintWriter out = null;
            BufferedReader in = null;
            StringBuilder stringBuilder = new StringBuilder();
            Gson gson = new Gson();

            try{
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                String firstline = in.readLine(); //get name
                String line;
                while ((line = in.readLine()) != null){
                    stringBuilder.append(line);
                }
                String result = stringBuilder.toString();
                FormatData formatData = gson.fromJson(result, FormatData.class);
                System.out.println("CLIENT: " + formatData.name);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
