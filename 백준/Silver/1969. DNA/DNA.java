import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] dna = new String[N];
        for(int i = 0; i < N; i++){
            dna[i] = br.readLine();
        }

        String answer = "";
        int min = 0;
        for(int i = 0; i < M; i++){
            int[] count = new int[100];
            for(int j = 0; j < N; j++){
                count[dna[j].charAt(i)]++;
            }
            int max = 0;
            char maxChar = 'a';
            for(char j = 'A'; j <= 'Z'; j++){
                if(count[j] > max){
                    max = count[j];
                    maxChar = j;
                }
            }
            min += (N-max);
            answer += maxChar;
        }
        System.out.println(answer);
        System.out.println(min);
    }
}
