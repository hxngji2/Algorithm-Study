import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    if (N == 1) {
      System.out.println(1);
    } else {
      int range = 2;
      int count = 1;

      while (range <= N) {
        range = range + (6 * count);
        count++;
      }
      System.out.println(count);
    }
  }
}
