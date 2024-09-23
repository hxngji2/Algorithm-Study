import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int k = Integer.parseInt(br.readLine());

    int[] stack = new int[k];
    int top = -1;

    for (int i = 0; i < k; i++) {
      int num = Integer.parseInt(br.readLine());

      if (num == 0) {
        if (top >= 0) {
          top--;
        }
      } else {
        top++;
        stack[top] = num;
      }
    }

    int sum = 0;

    for (int i = 0; i <= top; i++) {
      sum += stack[i];
    }

    System.out.println(sum);
  }

}
