import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            long ans = 0;
            for(int i = n-1; i >= 0; i--){
                if(max < arr[i]) {
                    max = arr[i];
                } else {
                    ans += max - arr[i];
                }
                
            }
            sb.append(String.format("#%d %d\n", tc, ans));

        }
        System.out.println(sb);
    }
}
