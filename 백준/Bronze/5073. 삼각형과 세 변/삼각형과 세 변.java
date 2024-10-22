import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0 && c == 0) {
        break;
      }

      if (a + b <= c || b + c <= c || c + a <= b) {
        sb.append("Invalid\n");
      } else if (a == b && b == c) {
        sb.append("Equilateral\n");
      } else if (a == b || b == c || c == a) {
        sb.append("Isosceles\n");
      } else {
        sb.append("Scalene\n");
      }
    }
    System.out.println(sb);
  }
}

