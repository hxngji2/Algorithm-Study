import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int length = Integer.parseInt(st.nextToken());
            String pwd = st.nextToken();

            Deque<Integer> q = new ArrayDeque<>();

            for (int i = 0; i < length; i++) {
                int n = pwd.charAt(i) - '0';

                if (q.isEmpty()) {
                    q.offer(n);
                } else {
                    if (q.peekLast() == n) {
                        q.pollLast();
                    } else {
                        q.offer(n);
                    }
                }
            }

            sb.append("#").append(tc).append(" ");
            while (!q.isEmpty()) {
                sb.append(q.poll());
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
