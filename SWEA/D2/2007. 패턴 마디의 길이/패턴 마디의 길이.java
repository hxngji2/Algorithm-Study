import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String str = br.readLine();

            int maxLength = 10;

            sb.append(String.format("#%d ", tc));

            for (int i = 0; i < maxLength; i++) {
                if (str.substring(0, i + 1).equals(str.substring(i + 1, i * 2 + 2))) {
                    sb.append(i + 1);
                    break;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
