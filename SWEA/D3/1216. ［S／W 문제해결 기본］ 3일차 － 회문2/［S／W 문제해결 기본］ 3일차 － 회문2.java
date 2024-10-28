import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

    
        for (int tc = 1; tc <= 10; tc++) {
            int num = Integer.parseInt(br.readLine());

            char[][] board = new char[100][100];

            for (int i = 0; i < 100; i++) {
                String str = br.readLine();
                for (int j = 0; j < 100; j++) {
                    board[i][j] = str.charAt(j);
                }
            }

            int maxLength = 1;

            for (int i = 0; i < 100; i++) {
                for (int start = 0; start < 100; start++) {
                    for (int end = start; end < 100; end++) {
                        if (row_palindrome(board, i, start, end)) {
                            maxLength = Math.max(maxLength, (end - start + 1));
                        }
                    }
                }
            }

            for (int i = 0; i < 100; i++) {
                for (int start = 0; start < 100; start++) {
                    for (int end = start; end < 100; end++) {
                        if (col_palindrome(board, i, start, end)) {
                            maxLength = Math.max(maxLength, (end - start + 1));
                        }
                    }
                }
            }

            sb.append("#").append(num).append(" ").append(maxLength).append("\n");

        }
        System.out.println(sb);
    }

    public static boolean row_palindrome(char[][] board, int i, int start, int end) {
        while(start < end){
            if(board[i][start] != board[i][end]) return false;
            start++;
            end--;
        }

        return true;
    }

    public static boolean col_palindrome(char[][] board, int i, int start, int end) {
        while(start < end) {
            if(board[start][i] != board[end][i]) return false;
            start++;
            end--;
        }
        return true;
    }
}
