import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        String star = "*";

        for (int i = 0; i < t; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}