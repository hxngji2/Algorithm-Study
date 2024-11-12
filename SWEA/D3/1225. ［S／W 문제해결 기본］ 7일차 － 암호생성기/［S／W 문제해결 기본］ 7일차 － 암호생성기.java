import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;

        while(T-- > 0){
            int tc = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            Deque<Integer> q = new ArrayDeque<>();

            for(int i = 0; i < 8; i++){
                q.offer(Integer.parseInt(st.nextToken()));
            }            

            int n = 1;

            while(true){
                int current = q.poll() - n;

                if(current <= 0){
                    q.offer(0);
                    break;
                } else {
                    q.offer(current);
                }
                n = (n % 5) + 1;
            }

            sb.append(String.format("#%d ",tc));

            while(!q.isEmpty()){
                sb.append(q.poll()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
