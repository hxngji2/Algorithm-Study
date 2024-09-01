import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    if (N == 1) {
      System.out.println("*");
      return;
    }

    StringBuilder sb = new StringBuilder();
    StringBuilder temp = new StringBuilder();
      
    String star = "* ".repeat(N/2);
    if (N%2!=0) {
      temp.append(star).append("* \n");
    } else {
      temp.append(star).append("\n");
    }
    temp.append(" ").append(star);

    for (int i = 0; i < N; i++) {
      sb.append(temp).append("\n");
    }
    System.out.println(sb);
  }
}