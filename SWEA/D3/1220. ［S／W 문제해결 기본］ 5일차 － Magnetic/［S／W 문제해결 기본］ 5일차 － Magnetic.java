import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = 10;
    for (int tc = 1; tc <= T; tc++) {
      int size = Integer.parseInt(br.readLine());
      int[][] arr = new int[size][size];
      for (int i = 0; i < size; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < size; j++) {
          arr[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      int count = 0;
      for (int i = 0; i < arr.length; i++) { 
        int last = 0;
        for (int j = 0; j < arr.length; j++) {
          if (arr[j][i] == 1) {
            last = 1;
          } else if (arr[j][i] == 2) {
            if (last == 1) {
              count++;
            }
            last = 2;
          }
        }
      }
      System.out.println("#" + tc + " " + count);
    }
  }
}
