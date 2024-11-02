import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        int num = 1;
        int count = 0;

        while(true){
            arr[num]++;

            if(arr[num]== M){
                break;
            }

            if(arr[num] % 2 == 1){
                num += L;
                if(num > N) {
                    num -= N;
                }
            } else {
                num -= L;
                if(num <= 0){
                    num += N;
                }
            }
            count++;
        }
        System.out.println(count);

    }
    
}
