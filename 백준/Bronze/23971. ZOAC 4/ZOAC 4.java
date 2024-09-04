import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int W = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int a = (W - 1) / (N + 1) + 1;
    int b = (H - 1) / (M + 1) + 1;

    System.out.println(a * b);
  }

}
