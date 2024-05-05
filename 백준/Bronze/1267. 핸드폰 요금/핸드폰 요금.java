import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] callTime = new int[N];
        for(int i = 0; i < N; i++){
            callTime[i] = Integer.parseInt(st.nextToken());
        }

        int Y = 0;
        int M = 0;

        for(int YTime: callTime){
            Y += 10+ YTime/30 * 10;
            M += 15 + YTime/60 * 15;
        }

        if(Y < M){
            System.out.println("Y " + Y);
        }else if(Y > M){
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + M);
        }
    }    
}
 