import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
            int[][] board = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;
            int crossSum1 = 0;
            int crossSum2 = 0;
            for (int i = 0; i < 100; i++) {
                crossSum1 += board[i][i];
                crossSum2 += board[i][99 - i];

                int rowSum = 0;
                int colSum = 0;
                for (int j = 0; j < 100; j++) {
                    rowSum += board[i][j];
                    colSum += board[j][i];
                    max = Math.max(max, Math.max(rowSum, colSum));
                }
                max = Math.max(max, Math.max(crossSum1, crossSum2));
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
