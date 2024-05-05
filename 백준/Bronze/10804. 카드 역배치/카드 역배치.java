import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cards = new int[21];

        for(int i = 1; i < cards.length; i++){
            cards[i] = i;
        }

        StringTokenizer st;
        int start = 0;
        int end = 0;
        int temp = 0;
        for(int i = 0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            for(int j = 0; j < (end-start+1)/2; j++){
                temp = cards[start+j];
                cards[start+j] = cards[end-j];
                cards[end-j] = temp;
            }            
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < cards.length; i++){
            sb.append(cards[i]).append(" ");
        }
        System.out.println(sb);
    }
}
