import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] board = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            int total = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1) {
                        cnt++;
                    } else if (cnt >= 1 && board[i][j] == 0) {
                        if (cnt == K)
                            total++;
                        cnt = 0;
                    }
                }
                if (cnt == K) {
                    total++;
                }
                cnt = 0;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[j][i] == 1) {
                        cnt++;
                    } else if (cnt >= 1 && board[j][i] == 0) {
                        if (cnt == K)
                            total++;
                        cnt = 0;
                    }
                }
                if (cnt == K)
                    total++;
                cnt = 0;
            }
            sb.append("#").append(tc).append(" ").append(total).append("\n");
        }
        System.out.println(sb);
    }
}
