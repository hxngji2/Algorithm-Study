import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
            int[] cnt = new int[money.length];

            for (int i = 0; i < money.length; i++) {
                cnt[i] = n / money[i];
                n %= money[i];
            }

            sb.append(String.format("#%d\n", tc));

            for (int i = 0; i < money.length; i++) {
                sb.append(cnt[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
