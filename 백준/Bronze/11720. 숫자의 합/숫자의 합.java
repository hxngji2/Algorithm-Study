import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String numbers = br.readLine();
        int number = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            number = numbers.charAt(i)-'0';
            sum += number;
        }

        System.out.println(sum);

    }
}