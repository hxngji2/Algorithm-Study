import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String messages = br.readLine();
        int R = 0;
        int C = 0;
        for(int i = 1; i <= Math.sqrt(messages.length()); i++){
            if(messages.length() % i == 0){
                R = i;
                C = messages.length() / i;
            }
        }
        int index = 0;
        char[][] message = new char[R][C];

        for(int j = 0; j < C; j++){
            for(int k = 0; k < R; k++){
                message[k][j] = messages.charAt(index++);
            }
        }

        for(int k = 0; k < R; k++){
            for(int j = 0; j < C; j++){
                System.out.print(message[k][j]);
            }
        }
    }
}
