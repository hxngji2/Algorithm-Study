import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static ArrayList<BigInteger> answer;

    public static void getNum(String input) {
        String s_number = "";
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x >= '0' && x <= '9') {
                s_number += x;
            } else {
                if (!s_number.isEmpty()) {
                    answer.add(new BigInteger(s_number));
                    s_number = "";
                }
            }
        }
        if (!s_number.isEmpty()) {
            answer.add(new BigInteger(s_number));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            getNum(tmp);
        }
        Collections.sort(answer);
        for (BigInteger s : answer) {
            System.out.println(s);
        }
    }
}
