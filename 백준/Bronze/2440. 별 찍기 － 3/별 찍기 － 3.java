import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = N; i > 0; i--){
            for(int j = N;j > 0;j--){
                sb.append("*");
            }
            sb.append("\n");
            N--;
        }
        System.out.println(sb);
    }
}
