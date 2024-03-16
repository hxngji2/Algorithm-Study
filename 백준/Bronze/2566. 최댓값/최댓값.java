import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] numbers = new int[9][9];
        int max = numbers[0][0];
        int x = 1, y = 1;
        for (int i = 0; i < numbers.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);

    }
}
