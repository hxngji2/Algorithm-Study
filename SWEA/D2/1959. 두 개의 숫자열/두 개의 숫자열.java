import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            int[] b = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            int max = Integer.MIN_VALUE;

            if (n == m) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i] * b[i];
                }
                max = sum;
            } else {
                int[] shortArr = (n < m) ? a : b;
                int[] longArr = (n < m) ? b : a;

                for (int i = 0; i <= longArr.length - shortArr.length; i++) {
                    int sum = 0;
                    for (int j = 0; j < shortArr.length; j++) {
                        sum += shortArr[j] * longArr[i + j];
                    }
                    max = Math.max(max, sum);
                }
            }

            sb.append(String.format("#%d %d\n", tc, max));
        }
        System.out.println(sb);
    }
}
