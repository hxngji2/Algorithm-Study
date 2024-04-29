import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];
        
        int sum = 0;
        for(int i = 0; i<num.length; i++){
            num[i] = Integer.parseInt(br.readLine());
        
            sum += num[i];
        }

        int avg = sum / num.length;

        Arrays.sort(num);

        int center = num.length / 2;

        System.out.println(avg);
        System.out.println(num[center]);
    }    
}
