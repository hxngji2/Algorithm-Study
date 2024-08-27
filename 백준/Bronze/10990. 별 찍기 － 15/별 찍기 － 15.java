import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      sb.append(" ".repeat(Math.max(0, N - i)));
      sb.append("*");
      sb.append(" ".repeat(Math.max(0, (2 * i) - 3)));
      if (i > 1) {
        sb.append("*");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
