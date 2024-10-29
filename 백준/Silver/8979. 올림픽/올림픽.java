import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] board = new int[N + 1][4];

        int rank = 1;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            int index = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 3; j++) {
                board[index][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            if (board[i][0] > board[K][0]) {
                rank++;
            } else if (board[i][0] == board[K][0] && board[i][1] > board[K][1]) {
                rank++;
            } else if (board[i][0] == board[K][0] && board[i][1] == board[K][1] && board[i][2] > board[K][2]) {
                rank++;
            }
        }

        System.out.println(rank);
    }
}
