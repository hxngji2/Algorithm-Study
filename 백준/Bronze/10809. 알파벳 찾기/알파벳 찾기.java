import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[26];

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (array[ch - 'a'] == -1) {
                array[ch - 'a'] = i;
            }
        }

        for (int val : array) {
            System.out.print(val + " ");
        }

    }
}