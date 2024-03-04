import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String doctor = br.readLine();

        if (doctor.length() < s.length() || doctor.length() == s.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}