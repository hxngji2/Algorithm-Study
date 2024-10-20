import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = 10;
    for (int i = 1; i <= T; i++) {
      int dump = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] height = new int[100];
      for (int j = 0; j < height.length; j++) {
        height[j] = Integer.parseInt(st.nextToken());
      }
      while (dump-- > 0) {
        Arrays.sort(height);
        height[99]--;
        height[0]++;
      }
      Arrays.sort(height);
      int result = height[99] - height[0];
      System.out.println("#" + i + " " + result);
    }
  }
}
