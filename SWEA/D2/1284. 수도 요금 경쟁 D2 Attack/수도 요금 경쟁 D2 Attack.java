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

            int p = Integer.parseInt(st.nextToken()); // A사 1리터당 요금
            int q = Integer.parseInt(st.nextToken()); // B사 기본 요금
            int r = Integer.parseInt(st.nextToken()); // B사 월간사용량 기준
            int s = Integer.parseInt(st.nextToken()); // B사 r을 초과하면 부과되는 요금
            int w = Integer.parseInt(st.nextToken()); // 주인공이 한달간 쓰는 양

            int ACost = 0;
            int BCost = 0;

            ACost = w * p;

            if (w <= r) {
                BCost = q;
            } else {
                BCost = q + ((w - r) * s);
            }

            sb.append(String.format("#%d %d\n", tc, Math.min(ACost, BCost)));
        }
        System.out.println(sb);
    }
}
