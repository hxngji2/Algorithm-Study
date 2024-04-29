import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] yutnori = new int[3][4];
        int zeroCount= 0;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                yutnori[i][j] = Integer.parseInt(st.nextToken());

                if(yutnori[i][j] == 0){
                    zeroCount++;
                }
            }
            switch(zeroCount){
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }
            zeroCount = 0;
        }
    }
}
