import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      sb.append(" ".repeat(Math.max(0, N - i)));
      sb.append("*".repeat(Math.max(0, 2 * i - 1)));
      sb.append("\n");
    }
    for (int i = 1; i < N; i++) {
      sb.append(" ".repeat(i));
      sb.append("*".repeat(Math.max(0, (2 * N) - (2 * i) - 1)));
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
