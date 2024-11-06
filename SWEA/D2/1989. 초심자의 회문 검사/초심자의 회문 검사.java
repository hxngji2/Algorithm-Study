import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String str = br.readLine();

            sb.append(String.format("#%d %d\n", tc, palindrome(str) ? 1 : 0));
        }
                System.out.println(sb);
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
