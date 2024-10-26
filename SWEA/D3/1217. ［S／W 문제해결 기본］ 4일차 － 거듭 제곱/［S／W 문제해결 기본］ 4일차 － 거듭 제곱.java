import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        
        for (int tc = 1; tc <= 10; tc++) {
            scn.nextInt();

            int N = scn.nextInt();
            int M = scn.nextInt();

            int result = N;
            for (int i = 0; i < M-1; i++) {
                result *= N;
            }
            System.out.println("#" + tc + " " + result);
        }
    }

}
