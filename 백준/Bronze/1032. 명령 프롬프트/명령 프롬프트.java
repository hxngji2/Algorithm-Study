import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];

        for (int i = 0; i < N; i++) {
            s[i] = br.readLine();
        }

        int len = s[0].length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean b = true;
            char ch = s[0].charAt(i);
            for (int j = 1; j < N; j++) {
                if (ch != s[j].charAt(i)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sb.append(ch);
            } else {
                sb.append("?");
            }
        }

        System.out.print(sb);
    }
}