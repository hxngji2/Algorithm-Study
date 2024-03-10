import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int koreanDay = 0;
        int mathDay = 0;

        if (A % C == 0) {
            koreanDay = L - A / C;
        } else {
            koreanDay = L - (A / C + 1);
        }

        if (B % D == 0) {
            mathDay = L - B / D;
        } else {
            mathDay = L - (B / D + 1);
        }
        System.out.println(Math.min(koreanDay, mathDay));
    }
}