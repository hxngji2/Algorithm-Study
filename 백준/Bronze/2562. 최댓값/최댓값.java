import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrays = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(br.readLine());

            if (arrays[i] > max) {
                max = arrays[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}

