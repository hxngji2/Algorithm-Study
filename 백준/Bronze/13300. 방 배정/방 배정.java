import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 학생 수
    int K = Integer.parseInt(st.nextToken()); // 방배정 최대 인원 수

    int[][] students = new int[2][7];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int S = Integer.parseInt(st.nextToken());
      int Y = Integer.parseInt(st.nextToken());

      students[S][Y]++;

    }

    int room = 0;

    for (int i = 0; i < 2; i++) {
      for (int j = 1; j < 7; j++) {
        room += (students[i][j] + K - 1) / K;
      }
    }
    System.out.println(room);
  }
}
