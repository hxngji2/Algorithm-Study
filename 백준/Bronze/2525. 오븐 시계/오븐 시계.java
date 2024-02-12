import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        int sum = h * 60 + m + time;

        h = (sum / 60) % 24;
        m = sum % 60;

        System.out.printf("%d %d", h, m);
    }
}