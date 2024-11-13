import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] board = new int[n][n];

            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int sum = 0;
            int max = 0;
            for(int i = 0; i < n-m+1; i++){
                for(int j = 0; j < n-m+1; j++){
                    for(int k = i; k < m+i; k++){
                        for(int r = j; r < m+j; r++){
                            sum += board[k][r];
                        }
                    }
                    max = Math.max(max,sum);
                    sum = 0;
                }
            }

            sb.append(String.format("#%d %d\n",tc,max));

        }
        System.out.println(sb);
    }
}
