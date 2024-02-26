import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] alphabet = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                alphabet[s.charAt(i) - 'A']++;
            }
            else {
                alphabet[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65);
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);

    }
}
