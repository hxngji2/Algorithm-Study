import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;

            while (true) {
                if (n % 2 == 0) {
                    n = n / 2;
                    a++;
                } else if (n % 3 == 0) {
                    n = n / 3;
                    b++;
                } else if (n % 5 == 0) {
                    n = n / 5;
                    c++;
                } else if (n % 7 == 0) {
                    n = n / 7;
                    d++;
                } else if (n % 11 == 0) {
                    n = n / 11;
                    e++;
                }
                if(n==1) break;
            }
            sb.append(String.format("#%d %d %d %d %d %d\n", tc, a, b, c, d, e));
        }
        System.out.println(sb);

    }
}
