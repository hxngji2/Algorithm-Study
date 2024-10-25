import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;

        for(int tc = 1; tc <= T; tc++) {
            int t = Integer.parseInt(br.readLine());
            String word = br.readLine();
            String line = br.readLine();
            int count = 0;

            for(int i = 0; i <= line.length()-word.length(); i++){
                if(line.substring(i,i+word.length()).equals(word)){
                    count++;
                }
            }

            sb.append(String.format("#%d %d",t, count)).append("\n");
        }
        System.out.println(sb);
    }
}
