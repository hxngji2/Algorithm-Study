import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] bingo = new int[5][5];
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count = 0;
        int turn = 0;
        
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                turn++;

                int num = Integer.parseInt(st.nextToken());

                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (bingo[k][l] == num) {
                            bingo[k][l] = 0;
                        }
                    }
                }

                rCheck();
                cCheck();
                lrCheck();
                rlCheck();

                if (count >= 3) {
                    System.out.println(turn);
                    return;
                }

                count = 0;
            }
        }
    }

    public static void rCheck() {
        for (int i = 0; i < 5; i++) {
            int zeroCount = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount == 5) {
                count++;
            }
        }
    }

    public static void cCheck() {
        for (int i = 0; i < 5; i++) {
            int zeroCount = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount == 5) {
                count++;
            }
        }
    }

    public static void lrCheck() {
        int zeroCount = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == 5) {
            count++;
        }
    }

    public static void rlCheck() {
        int zeroCount = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == 5) {
            count++;
        }
    }
}
