import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < N - i; j++) {
        sb.append(" ");
      }
      sb.append("*");
      for (int j = 1; j < (2 * i) - 2; j++) {
        sb.append(" ");
      }
      if (i > 1) {
        sb.append("*");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
