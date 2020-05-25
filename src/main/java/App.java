import models.OtherPingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        System.out.println("Hello Java");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("I'm a ping-pong application!\n");

        System.out.println("Enter a number");
        try{
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            OtherPingPong otherPingPong = new OtherPingPong();
            ArrayList<Object> pingPongResult = otherPingPong.runPingPong1(intUserNumber);
            System.out.println(pingPongResult);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
