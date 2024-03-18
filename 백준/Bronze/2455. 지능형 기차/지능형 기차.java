import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        int max = 0;
        int now = 0;
        StringTokenizer st;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            now -= a;
            now += b;
            max = Math.max(max, now);
        }

        System.out.print(max);

    }
}
