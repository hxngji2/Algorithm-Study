import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
     * 결과: 제일 마지막에 남는 카드 숫자
     * 싸이클: 1번을 버리면 나머지 숫자가 다시 정렬되고, 그때의 1번을 뺴서 맨뒤에 넣어줌
     * size가 1일 때까지 반복
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();

            if(q.size() > 1){
                int num = q.poll();
                q.offer(num);
            }
        }

        System.out.println(q.peek());
    }
}
