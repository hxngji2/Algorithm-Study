import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N+1; i++){
            if(N % i == 0){
                sb.append(i).append(" ");        
            }
        }

        System.out.println(sb);
    }    
}
