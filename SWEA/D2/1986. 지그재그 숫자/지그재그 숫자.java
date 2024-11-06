import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[] num = new int[n];

            for (int i = 0; i < n; i++) {
                num[i] = i + 1;
            }

            int sum = 1;

            for (int i = 1; i < n; i++) {
                if (num[i] % 2 == 0) {
                    sum -= num[i];
                } else {
                    sum += num[i];
                }
            }

            sb.append(String.format("#%d %d\n", tc, sum));
        }
        System.out.println(sb);
    }
}
