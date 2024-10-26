import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {
    static Map<String, Integer> code = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        code.put("0001101", 0);
        code.put("0011001", 1);
        code.put("0010011", 2);
        code.put("0111101", 3);
        code.put("0100011", 4);
        code.put("0110001", 5);
        code.put("0101111", 6);
        code.put("0111011", 7);
        code.put("0110111", 8);
        code.put("0001011", 9);

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String[] board = new String[N];

            for (int i = 0; i < N; i++) {
                board[i] = br.readLine();
            }

            int[] nums = new int[8];
            check(board, nums, N, M);
            int result = 0;
            for(int i = 0; i < 8; i++){
                if(i % 2 == 0){
                    result += nums[i];
                } else {
                    result += nums[i] * 3;
                }
            }
            sb.append(String.format("#%d ",tc));
            int sum = 0;
            if(result%10==0){
                for(int i = 0; i < 8; i++){
                    sum += nums[i];
                }
                sb.append(sum).append("\n");
            } else {
                sb.append( 0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void check(String[] board, int[] nums, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = M - 1; j >= 7; j--) {
                if (board[i].charAt(j) == '1') {
                    for (int k = 0; k < 8; k++) {
                        nums[k] = code.get(board[i].substring(j + 1 - (k + 1) * 7, j + 1 - k * 7));
                    }
                    return;
                }
            }
        }
    }
}
