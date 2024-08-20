import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      sb.append(" ".repeat(i));
      sb.append("*".repeat(Math.max(0, 2 * (N - i) - 1)));
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
