import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chess = {1, 1, 2, 2, 2, 8};

        int[] white = new int[chess.length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < chess.length; i++) {
            white[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < chess.length; j++) {
            if (chess[j] == white[j])
                white[j] = 0;
            else
                white[j] = chess[j] - white[j];
        }

        for (int value : white){
            System.out.print(value + " ");
        }
    }
}