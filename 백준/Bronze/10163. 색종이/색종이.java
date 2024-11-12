import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 

        int n = Integer.parseInt(br.readLine());

        int[] count = new int[n+1];
        int[][] board = new int[1001][1001];

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for(int j = x; j < (x + width); j++){
                for(int k = y; k < (y + height); k++){
                    board[j][k] = i;
                }
            }
        }

        for(int i = 0; i < 1001; i++){
            for(int j = 0; j < 1001; j++){
                count[board[i][j]]++;
            }
        }

        for(int i = 1; i < n+1; i++){
            sb.append(count[i]).append("\n");    
        }

        System.out.println(sb);
    }
}
