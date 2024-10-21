import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

  static final int ARRAY_SIZE = 8;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = 10;

    for (int tc = 1; tc <= T; tc++) {
      int length = Integer.parseInt(br.readLine());
      char[][] arr = new char[ARRAY_SIZE][ARRAY_SIZE];
      for (int i = 0; i < arr.length; i++) {
        String str = br.readLine();
        for (int j = 0; j < arr.length; j++) {
          arr[i][j] = str.charAt(j);
        }
      }
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
          if (col_palindrome(i, j, length, arr)) {
            count++;
          }
          if (row_palindrome(i, j, length, arr)) {
            count++;
          }
        }
      }
      System.out.println("#" + tc + " " + count);
    }
  }

  public static boolean col_palindrome(int i, int j, int length, char[][] arr) {
    if (j + length - 1 >= 8) {
      return false;
    }
    for (int k = 0; k < length / 2; k++) {
      if (arr[i][j + k] != arr[i][j + length - k - 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean row_palindrome(int i, int j, int length, char[][] arr) {
    if (i + length - 1 >= 8) {
      return false;
    }
    for (int k = 0; k < length / 2; k++) {
      if (arr[i + k][j] != arr[i + length - k - 1][j]) {
        return false;
      }
    }
    return true;
  }
}
