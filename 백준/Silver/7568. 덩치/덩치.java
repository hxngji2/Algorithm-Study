import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] specs = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 2; j++){
                specs[i][j] = Integer.parseInt(st.nextToken());
            } 
        }

        for(int i = 0; i < N; i++){
            int rank = 1;
            for(int j = 0; j < N; j++){
                if(i == j) continue;

                if(specs[i][0] < specs[j][0] && specs[i][1] < specs[j][1]){
                    rank++;
                }
            }

            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }
}
