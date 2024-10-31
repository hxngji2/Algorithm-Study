import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    /*
     * 결과: 최소한의 높이 찾기
     * 고려사항
     * 1. 첫 가로등과 시작점까지의 거리
     * 2. 각 가로등 사이의 거리의 절반 -> 겹치는 부분은 빼줘도 되니까
     * 3. 마지막 가로등과 끝점까지의 거리
     * 
     * 그 때의 거리와 현재 높이를 비교해서 필요한 거리만큼 높이 증가 -> max로
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine()); // 굴다리 길이
        int M = Integer.parseInt(br.readLine()); // 가로등 개수

        int[] x = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        int a = x[0];

        for (int i = 1; i < M; i++) {
            int gap = x[i] - x[i - 1];
            int h = 0;
            if (gap % 2 == 0) {
                h = gap / 2;
            } else {
                h = (gap / 2) + 1;
            }
            a = Math.max(a, h);
        }

        a = Math.max(length - x[M - 1], a);

        System.out.println(a);

    }
}
