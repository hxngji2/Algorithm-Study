import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int firstH = Integer.parseInt(st.nextToken());
            int firstM = Integer.parseInt(st.nextToken());
            int secondH = Integer.parseInt(st.nextToken());
            int secondM = Integer.parseInt(st.nextToken());

            int ansH = firstH + secondH;
            int ansM = firstM + secondM;

            if (ansM > 59) {
                ansH++;
                ansM -= 60;
            }
            if (ansH > 12) {
                ansH -= 12;
            }

            sb.append(String.format("#%d %d %d\n", tc, ansH, ansM));
        }

        System.out.println(sb);
    }
}
