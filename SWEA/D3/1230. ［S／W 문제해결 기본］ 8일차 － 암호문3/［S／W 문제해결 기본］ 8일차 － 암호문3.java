import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            List<Integer> list = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                String command = st.nextToken();

                if (command.equals("I")) {
                    int index = Integer.parseInt(st.nextToken());
                    int length = Integer.parseInt(st.nextToken());

                    List<Integer> code = new LinkedList<>();

                    for (int j = 0; j < length; j++) {
                        code.add(Integer.parseInt(st.nextToken()));
                    }
                    list.addAll(index, code);
                } else if (command.equals("D")) {
                    int index = Integer.parseInt(st.nextToken());
                    int length = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < length; j++) {
                        list.remove(index);
                    }
                } else {
                    int length = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < length; j++) {
                        list.add(Integer.parseInt(st.nextToken()));
                    }
                }
            }

            sb.append(String.format("#%d ", tc));
            for(int i = 0; i < 10; i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
