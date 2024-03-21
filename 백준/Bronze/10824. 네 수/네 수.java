import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");

        long ab = Long.parseLong(num[0] + num[1]);
        long cd = Long.parseLong(num[2] + num[3]);

        System.out.print(ab + cd);
    }
}

