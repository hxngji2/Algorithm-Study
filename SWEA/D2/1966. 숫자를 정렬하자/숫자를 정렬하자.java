import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[] num = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num);

            sb.append(String.format("#%d ", tc));

            for(int i = 0; i < n; i++){
                sb.append(num[i]).append(" ");
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
