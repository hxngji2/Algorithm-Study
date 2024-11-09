import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int start = 0;
            long ans = 0;
            while (start < n) {

                int maxIdx = start;
                for (int i = start + 1; i < n; i++) {
                    if (arr[maxIdx] < arr[i])
                        maxIdx = i;
                }

                for (int i = start; i < maxIdx; i++) {
                    ans += arr[maxIdx] - arr[i];
                }

                start = maxIdx + 1;
            }
            sb.append(String.format("#%d %d\n", tc, ans));
        }

        System.out.println(sb);
    }
}
