import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int date = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == date) {
                count++;
            }
        }

        System.out.println(count);

    }
}