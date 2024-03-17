import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = {300, 60, 10};

        int T = Integer.parseInt(br.readLine());

        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            for (int j : arr) {
                sb.append(T / j).append(" ");
                T %= j;
            }
            System.out.print(sb);
        }
    }
}
