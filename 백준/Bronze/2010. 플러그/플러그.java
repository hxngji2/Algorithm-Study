import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int plug = 0;
        int computer = 0;
        for (int i = 0; i < n; i++) {
            plug = Integer.parseInt(br.readLine());
            if (i < n - 1) {
                plug--;
            }
            computer += plug;

        }
        System.out.println(computer);
    }
}


