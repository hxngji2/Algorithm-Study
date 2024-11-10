import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[][] board = new int[n][n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                int prev = 0;
                for (int j = 0; j < n; j++) {
                    if (board[j][i] != 0) {
                        if (board[j][i] == 2 && prev == 1) {
                            ans += 1;
                        }
                        prev = board[j][i];
                    }
                }
            }
            sb.append(String.format("#%d %d\n",tc, ans));

        }
        System.out.println(sb);
    }
}
