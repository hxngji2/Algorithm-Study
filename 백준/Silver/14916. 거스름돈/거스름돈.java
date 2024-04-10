import java.io.*;

import java.util.*;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        if(N < 5){
            if ( N % 2 == 0){
                cnt = N / 2;
            } else
                cnt = -1;
                System.out.println(cnt);
                return;
        }

        cnt = N / 5;
        
        if((N % 5) % 2 != 0){
            cnt -= 1;

            N = N - (cnt * 5);

            cnt += N / 2;

        } else {
            N = N % 5;
            cnt += N / 2;

        }
        System.out.println(cnt);
    }
}
