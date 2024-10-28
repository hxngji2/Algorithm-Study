import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            String[] nums = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

            Map<String,Integer> n = new HashMap<>();
    
            n.put("ZRO", 0);
            n.put("ONE", 1);
            n.put("TWO", 2);
            n.put("THR", 3);
            n.put("FOR", 4);
            n.put("FIV", 5);
            n.put("SIX", 6);
            n.put("SVN", 7);
            n.put("EGT", 8);
            n.put("NIN", 9);

            StringTokenizer st = new StringTokenizer(br.readLine());
            String qNum = st.nextToken();
            int length = Integer.parseInt(st.nextToken());
            int[] num = new int[length];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < length; i++){
                String numStr = st.nextToken();
                int index = n.get(numStr);
                num[index]++;
            }

            sb.append(qNum).append("\n");
            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < num[i]; j++){
                    sb.append(nums[i]).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
