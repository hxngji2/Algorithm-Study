import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = 10;

    for (int tc = 1; tc <= T; tc++) {
      int N = Integer.parseInt(br.readLine());
      int[] height = new int[N];
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
        height[i] = Integer.parseInt(st.nextToken());
      }
      int count = 0;
      for (int i = 2; i < N - 2; i++) {
        int max = Math.max(height[i - 2],
            Math.max(height[i - 1], Math.max(height[i + 1], height[i + 2])));
        if (height[i] > max) {
          count += height[i] - max;
        }
      }
      System.out.println("#" + tc + " " + count);
    }
  }
}
