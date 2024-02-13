import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalAmount = Integer.parseInt(br.readLine()); // 영수증 총금액
        int kindCount = Integer.parseInt(br.readLine()); // 종류 수

        int sum = 0;

        for (int i = 0; i < kindCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int productCount = Integer.parseInt(st.nextToken());
            sum += price * productCount;
        }

        if (sum == totalAmount){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}