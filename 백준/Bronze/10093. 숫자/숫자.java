import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        if(min < max){
            for(int i = 0; i < max - min - 1; i++){
                sb.append(min + i + 1).append(" ");
            }
            System.out.println(max - min - 1);    
        } else if(min > max){
            for(int i = 0; i < min - max - 1; i++){
                sb.append(max + i + 1).append(" ");
            }
            System.out.println(min - max - 1);
        } else {
            System.out.println(0);
        }
         
        System.out.println(sb);
    }
}
