import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {

            int n = Integer.parseInt(br.readLine());

            int[][] paskal = new int[n][n];

            sb.append(String.format("#%d\n", tc));

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j) {
                        paskal[i][j] = 1;
                    } else if (j == 0) {
                        paskal[i][j] = 1;
                    } else if (j > 0 && j < i) {
                        paskal[i][j] = paskal[i - 1][j - 1] + paskal[i - 1][j];
                    }
                    sb.append(paskal[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
