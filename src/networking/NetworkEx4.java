package networking;

import java.io.*;
import java.net.*;

public class NetworkEx4 {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "https://rsh8040.github.io/my_portfolio/";
        String line = "";

        try{
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

            while((line=input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }    
}
