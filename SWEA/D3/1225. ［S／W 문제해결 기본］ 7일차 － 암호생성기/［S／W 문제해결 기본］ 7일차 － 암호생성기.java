import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution {
  static Deque<Integer> queue;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = 10;
    for (int tc = 1; tc <= T; tc++) {
      int num = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      queue = new ArrayDeque<>();
      for (int i = 0; i < 8; i++) {
        queue.offer(Integer.parseInt(st.nextToken()));
      }
      cycle();
      StringBuilder sb = new StringBuilder();
      sb.append("#").append(tc).append(" ");
      for (int i = 0; i < 8; i++) {
        sb.append(queue.poll()).append(" ");
      }
      sb.append("\n");
      System.out.println(sb);
    }
  }

  public static void cycle() {
    int index = 1;
    while (true) {
      int current = queue.poll() - index;

      if (current <= 0) {
        queue.offer(0);
        break;
      } else {
        queue.offer(current);
      }
      index = (index % 5) + 1;
    }
  }
}
