import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arrays = new int[n];

        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }

        for (int array : arrays) {
            if (array < x) {
                sb.append(array).append(" ");
            }
        }

        System.out.println(sb);
    }
}

