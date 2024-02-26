import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();

        boolean pelindrome = true;

        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] != ch[ch.length - 1 - i]) {
                pelindrome = false;
                break;
            } else
                pelindrome = true;
        }

        if (pelindrome)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
