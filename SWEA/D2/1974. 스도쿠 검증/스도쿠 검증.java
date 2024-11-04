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

            sb.append(String.format("#%d %d\n", tc, isValidSudoku(sudoku) ? 1 : 0));
        }

        System.out.println(sb);
    }

    public static boolean isValidSudoku(int[][] sudoku) {
        return checkRows(sudoku) && checkColumns(sudoku) && checkBox(sudoku);
    }

    public static boolean checkRows(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {
            int[] usedCnt = new int[10];
            for (int j = 0; j < 9; j++) {
                usedCnt[sudoku[i][j]]++;
                if (usedCnt[sudoku[i][j]] > 1)
                    return false;
            }
        }

        return true;
    }

    public static boolean checkColumns(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            int[] usedCnt = new int[10];
            for (int j = 0; j < 9; j++) {
                usedCnt[sudoku[j][i]]++;
                if (usedCnt[sudoku[j][i]] > 1)
                    return false;
            }
        }
        return true;
    }

    public static boolean checkBox(int[][] sudoku) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] usedCnt = new int[10];
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int o = j * 3; o < j * 3 + 3; o++) {
                        usedCnt[sudoku[k][o]]++;
                        if (usedCnt[sudoku[k][o]] > 1)
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
