import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] baskets = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            int temp = baskets[I-1];
            baskets[I-1] = baskets[J-1];
            baskets[J-1] = temp;
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
    }
}

