import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int first, second;
        while (true) {
            st = new StringTokenizer(br.readLine());

            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());

            if (first == 0 && second == 0) break;

            if (first % second == 0) {
                sb.append("multiple").append("\n");
            } else if (second % first == 0) {
                sb.append("factor").append("\n");
            } else
                sb.append("neither").append("\n");
        }

        System.out.print(sb);
    }
}
