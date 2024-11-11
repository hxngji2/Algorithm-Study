import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            String str = br.readLine();

            int ans = 0;
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'O') {
                    cnt++;
                    ans += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(ans);
        }
    }
}
