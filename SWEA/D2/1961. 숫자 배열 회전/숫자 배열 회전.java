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

            int n = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            String[] a90 = new String[n];
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = n-1; j >= 0; j--) {
                    str += String.valueOf(arr[j][i]);
                }
                a90[i] = str;
            }

            String[] a180 = new String[n];
            for(int i = n-1; i >= 0; i--){
                String str = "";
                for(int j = n-1; j >= 0; j--){
                    str += String.valueOf(arr[i][j]);
                }
                a180[n-1-i] = str;
            }

            String[] a270 = new String[n];
            for(int i = n-1; i >= 0; i--){
                String str = "";
                for(int j = 0; j < n; j++){
                    str += String.valueOf(arr[j][i]);
                }
                a270[n-1-i] = str; 
            }

            sb.append(String.format("#%d\n", tc));
            for(int i = 0; i < n; i++){
                sb.append(a90[i]).append(" ").append(a180[i]).append(" ").append(a270[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
