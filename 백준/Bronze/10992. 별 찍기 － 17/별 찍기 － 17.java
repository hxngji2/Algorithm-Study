import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N - 1; i++) {
      sb.append(" ".repeat(Math.max(0, N - i)));
      sb.append("*");
      sb.append(" ".repeat(Math.max(0, (i * 2) - 3)));
      if (i > 1) {
        sb.append("*");
      }
      sb.append("\n");
    }
    for (int i = 0; i < 1; i++) {
      sb.append("*".repeat(Math.max(0, (2 * N) - 1)));
    }
    System.out.println(sb);
  }
}
