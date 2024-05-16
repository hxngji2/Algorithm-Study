import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        int result = 1;
        sb.append(result).append(" ");
        for(int i = 0; i < n; i++){
            result *= 2;
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }    
}
