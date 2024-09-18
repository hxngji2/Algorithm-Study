import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] plasticNums = new int[9];
    buySet(plasticNums);

    int count = 1;

    while (N != 0) {
      int remain = N % 10;

      if (remain == 9) {
        remain = 6;
      }

      if (plasticNums[remain] == 0) {
        buySet(plasticNums);
        plasticNums[remain]--;
        count++;
      } else {
        plasticNums[remain]--;
      }
      N /= 10;
    }

    System.out.println(count);

  }

  public static void buySet(int[] plasticNums) {
    for (int i = 0; i < 9; i++) {
      if (i == 6) {
        plasticNums[i] += 2;
      } else {
        plasticNums[i] += 1;
      }
    }
  }
}

