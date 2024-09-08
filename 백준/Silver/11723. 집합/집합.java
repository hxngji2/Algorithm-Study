import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    HashSet<Integer> S = new HashSet<>();
    int M = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());

      String method = st.nextToken();
      int x = 0;
      if (!method.equals("all") && !method.equals("empty")) {
        x = Integer.parseInt(st.nextToken());
      }

      switch (method) {
        case "add":
          S.add(x);
          break;
        case "remove":
          S.remove(x);
          break;
        case "check":
          if (S.contains(x)) {
            sb.append(1).append("\n");
          } else {
            sb.append(0).append("\n");
          }
          break;
        case "toggle":
          if (S.contains(x)) {
            S.remove(x);
          } else {
            S.add(x);
          }
          break;
        case "all":
          S.clear();
          for (int j = 1; j <= 20; j++) {
            S.add(j);
          }
          break;
        case "empty":
          S.clear();
      }
    }
    System.out.println(sb);
  }
}
