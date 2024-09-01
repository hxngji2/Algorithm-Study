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

    String star = "* ";
    String tempStar = "";
    int count = N / 2;
    if (N % 2 != 0) {
      tempStar = star.repeat(count + 1) + "\n " + star.repeat(count) + "\n";
    } else {
      tempStar = star.repeat(count) + "\n " + star.repeat(count) + "\n";
    }

    System.out.println(tempStar.repeat(N));
  }
}