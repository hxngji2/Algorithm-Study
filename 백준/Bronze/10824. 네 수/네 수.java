import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");

        long ab = Long.parseLong(num[0] + num[1]);
        long cd = Long.parseLong(num[2] + num[3]);

        sb.append(ab + cd);
        System.out.print(sb);
    }
}

