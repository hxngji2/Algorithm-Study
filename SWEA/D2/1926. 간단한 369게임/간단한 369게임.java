import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            int num = i;
            int cnt = 0;

            while (num != 0) {
                int k = num % 10;

                if (k == 3 || k == 6 || k == 9) {
                    cnt++;
                }

                num = num / 10;
            }

            if (cnt == 0) {
                sb.append(i);
            } else {
                while(cnt-- >0){
                    sb.append("-");
                }
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
