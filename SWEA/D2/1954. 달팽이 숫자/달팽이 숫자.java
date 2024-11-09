import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            sb.append(String.format("#%d\n", tc));

            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];

            int dir = 0;
            int x = 0, y = 0;

            for (int cnt = 1; cnt <= n * n; cnt++) {
                arr[x][y] = cnt;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }
                x = nx;
                y = ny;

            }

            for (int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
