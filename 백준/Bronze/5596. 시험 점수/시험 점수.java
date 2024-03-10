import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] minguk = new int[4];
        int[] manse = new int[4];

        int S = 0;
        for (int i = 0; i < 4; i++) {
            minguk[i] = Integer.parseInt(st.nextToken());
            S += minguk[i];
        }

        st = new StringTokenizer(br.readLine());
        int T = 0;
        for (int i = 0; i < 4; i++) {
            manse[i] = Integer.parseInt(st.nextToken());
            T += manse[i];
        }
        if (S == T)
            System.out.println(S);
        else
            System.out.println(Math.max(S,T));

    }
}