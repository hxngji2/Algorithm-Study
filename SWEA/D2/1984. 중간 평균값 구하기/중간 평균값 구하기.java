import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= t; tc++){
            int[] nums = new int[10];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < 10; i++){
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            double sum = 0;

            for(int i = 1; i < 9; i++){
                sum += nums[i];
            }

            double avg = sum / 8;

            sb.append(String.format("#%d %.0f\n", tc, avg));
        }
        System.out.println(sb);
    }
}
