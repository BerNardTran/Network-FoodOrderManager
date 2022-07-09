package client;

import Const.PORT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.Format;
import java.util.concurrent.ForkJoinTask;

import InsertData.InsertUserName;
import Server.FormatData;
import com.google.gson.Gson;

public class Client {
    public static void main(String[] args) {
//        InsertUserName.insertNameOfClient();
        try(Socket socket = new Socket("localhost", PORT.PORT);){
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //save all data
            FormatData formatData = new FormatData();
            formatData.name =   InsertUserName.insertNameOfClient(); //insert username to server

            // convert object to json
            Gson gson = new Gson();
            String result = gson.toJson(formatData);
            out.println(result);
            out.flush();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
