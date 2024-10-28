import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int P = Integer.parseInt(br.readLine());

        while (P-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tc = Integer.parseInt(st.nextToken());


            int[] std = new int[20];

            for(int i = 0; i < 20; i++){
                std[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;

            for(int i = 0; i < 20; i++){
                for(int j = 0; j < i; j++){
                    if(std[i] < std[j]){
                        count++;
                    }
                }
            }
            sb.append(tc).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}
