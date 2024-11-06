import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] date = new int[4];

            for (int i = 0; i < 4; i++) {
                date[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(String.format("#%d ",tc));
            int cnt = 0;
            if (date[0] == date[2]) {
                cnt += date[3] - date[1] + 1;
                sb.append(cnt);
            } else {
                cnt += days[date[0]] - date[1] + 1;
                for (int i = 1; i < date[2]-date[0]; i++) {
                    cnt += days[date[0] + i];
                }
                cnt += date[3];
                sb.append(cnt);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
