import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            for(int k = i; k < N; k++){
                sb.append(" ");
            }
            
            for(int j = 0; j < 2 * i - 1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    } 
}
