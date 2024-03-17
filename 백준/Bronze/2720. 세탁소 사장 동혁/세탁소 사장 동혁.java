import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        int C;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        for (int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());
            sb.append(C / quarter).append(" ");
            C = C % quarter;
            sb.append(C / dime).append(" ");
            C = C % dime;
            sb.append(C / nickel).append(" ");
            C = C % nickel;
            sb.append(C/penny).append("\n");
        }

        System.out.print(sb);

    }
}
