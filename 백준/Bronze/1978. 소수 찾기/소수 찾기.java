import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        int isPN;
        int count = 0;
        for(int i = 0; i < N; i++){
            isPN = Integer.parseInt(st.nextToken());

            for(int j = 2; j <= isPN; j++){
                if(j == isPN){
                    count++;
                }
                if(isPN % j == 0){
                    break;
                }
            }
        }        
        System.out.println(count);
    }
}

