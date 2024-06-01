import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    Deque<Integer> queue = new ArrayDeque<>();

    for (int i = 1; i <= N; i++){
      queue.offer(i);
    }

    while (queue.size() > 1){
      queue.poll();
      queue.offer(queue.poll());
    }

    System.out.println(queue.poll());
  }
}
