import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i >= 0; i--){    
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
