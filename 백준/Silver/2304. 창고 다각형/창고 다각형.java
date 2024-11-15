import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];

        int maxIdx = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            arr[l] = h;

            if(max < h){
                max = h;
                maxIdx = l;
            }
        }

        int ans = 0;
        max = 0;
        for(int i = 0; i < maxIdx+1; i++){
            max = Math.max(max,arr[i]);
            ans += max;
        }

        max = 0;
        for(int i = 1000; i > maxIdx; i--){
            max = Math.max(max,arr[i]);
            ans += max;
        }

        System.out.println(ans);
    }
}
