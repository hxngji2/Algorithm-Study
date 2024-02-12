import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstDice = Integer.parseInt(st.nextToken());
        int secondDice = Integer.parseInt(st.nextToken());
        int thirdDice = Integer.parseInt(st.nextToken());

        int money = 0;
        if (firstDice == secondDice && secondDice == thirdDice) {
            money = 10_000 + firstDice * 1_000;
            System.out.println(money);
        } else if (firstDice == secondDice || firstDice == thirdDice) {
            money = 1_000 + firstDice * 100;
            System.out.println(money);
        } else if (secondDice == thirdDice) {
            money = 1_000 + secondDice * 100;
            System.out.println(money);
        } else {
            if (firstDice > secondDice && firstDice > thirdDice) {
                money = firstDice * 100;
                System.out.println(money);
            } else if (secondDice > firstDice && secondDice > thirdDice) {
                money = secondDice * 100;
                System.out.println(money);
            } else {
                money = thirdDice * 100;
                System.out.println(money);
            }
        }
    }
}