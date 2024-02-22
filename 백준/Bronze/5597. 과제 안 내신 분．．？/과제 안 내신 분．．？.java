import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[31];

        for (int i = 1; i < 29; i++) {
            int complete = Integer.parseInt(br.readLine());
            n[complete] = 1;
        }

        for (int i = 1; i < n.length; i++) {
            if (n[i] != 1)
                System.out.println(i);
        }
    }
}

