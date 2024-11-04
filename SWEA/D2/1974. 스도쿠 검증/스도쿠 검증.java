import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[][] sudoku = new int[9][9];

            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            boolean isCorrect = true;

            int[] rowNums = new int[10];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    rowNums[sudoku[i][j]]++;
                }

                for (int j = 1; j <= 9; j++) {
                    if (rowNums[j] != 1) {
                        isCorrect = false;
                        break;
                    }
                }
                rowNums = new int[10];
            }

            int[] colNums = new int[10];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    colNums[sudoku[j][i]]++;
                }

                for (int j = 1; j <= 9; j++) {
                    if (colNums[j] != 1) {
                        isCorrect = false;
                        break;
                    }
                }
                colNums = new int[10];
            }

            int[] boxNums = new int[10];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = i * 3; k < i*3+3; k++) {
                        for (int o = j * 3; o < j*3+3; o++) {
                            boxNums[sudoku[k][o]]++;
                        }
                    }
                    for (int k = 1; k <= 9; k++) {
                        if (boxNums[k] != 1) {
                            isCorrect = false;
                            break;
                        }
                    }
                    boxNums = new int[10];
                }
            }

            sb.append(String.format("#%d %d\n", tc, isCorrect ? 1 : 0));
        }

        System.out.println(sb);
    }
}
