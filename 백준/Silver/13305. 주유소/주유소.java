import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] km = new long[N - 1];
        long[] price = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            km[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long total = 0;
        long minPrice = price[0];

        for (int i = 0; i < N - 1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            total += minPrice * km[i];
        }

        System.out.println(total);
    }
}
