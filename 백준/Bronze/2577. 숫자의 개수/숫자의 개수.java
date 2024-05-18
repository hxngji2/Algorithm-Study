import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int[] count = new int[10];
        int result = A * B * C;
        int reminder = 0;
        
        for(int i = 0; i < count.length; i++){
            reminder = result % 10;
            count[reminder]++;
            result /= 10;

            if(result == 0) break;
        }

        for(int num: count){
            System.out.println(num);
        }
    }    
}
