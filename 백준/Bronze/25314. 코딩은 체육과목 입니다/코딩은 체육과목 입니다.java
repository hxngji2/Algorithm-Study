import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String type = "long ";

        for (int i = 0; i < n/4 ; i++) {
            System.out.print(type);
        }

        System.out.println("int");


    }
}