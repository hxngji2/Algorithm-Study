import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static String[] rate = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            double[] score = new double[n];
            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                score[i] = a * 0.35 + b * 0.45 + c * 0.2; 
            }

            double kScore = score[k-1];

            Arrays.sort(score);

            String ans = "";
            for(int i = 0; i < n; i++){
                if(kScore == score[i]){
                    ans = rate[i/(n/10)];
                    break;
                }
            }

            sb.append(String.format("#%d %s\n",tc,ans));

        }
        System.out.println(sb);
    }
}
