import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int tc = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] counts = new int[1001];

            for(int i = 1; i <= 1000; i++){
                int num = Integer.parseInt(st.nextToken());
                counts[num]++;
            }

            int index = 1;

            for(int i = 1; i <= 1000; i++){
                if(counts[i] > counts[0]){
                    index = i;
                    counts[0] = counts[i];
                } else if(counts[i] == counts[0]){
                    index = i;
                }
            }

            sb.append("#").append(tc).append(" ").append(index).append("\n");

        }

        System.out.println(sb);
    }
}
