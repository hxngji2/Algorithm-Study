import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int round = 1; round <= n; round++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ACount = Integer.parseInt(st.nextToken());

            int[] ACard = new int[5];
            for (int i = 0; i < ACount; i++) {
                ACard[Integer.parseInt(st.nextToken())]++;
            }

            st = new StringTokenizer(br.readLine());
            int BCount = Integer.parseInt(st.nextToken());

            int[] BCard = new int[5];
            for (int i = 0; i < BCount; i++) {
                BCard[Integer.parseInt(st.nextToken())]++;
            }

            for (int i = 4; i > 0; i--) {
                if (ACard[i] > BCard[i]){
                    sb.append("A\n");
                    break;
                }
                else if (ACard[i] < BCard[i]){
                    sb.append("B\n");
                    break;
                }
                else if (ACard[i] == BCard[i] && i == 1){
                    sb.append("D\n");
                }
            }
        }
        System.out.println(sb);
    }
}
