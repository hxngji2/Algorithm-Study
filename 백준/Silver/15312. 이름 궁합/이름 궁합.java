import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        String boyName = br.readLine();
        String girlName = br.readLine();

        int[] arr = new int[boyName.length() + girlName.length()];

        for(int i = 0; i < arr.length -1; i = i+2){
            arr[i] = alphabet[boyName.charAt(i/2) - 65];
            arr[i+1] = alphabet[girlName.charAt(i/2) - 65];
        }

        int size = arr.length;
        while(size > 2){
            for(int i = 0; i < size-1; i++){
                arr[i] = (arr[i] + arr[i+1]) % 10;
            }
            arr[--size] = 0;
        }
        System.out.println(String.valueOf(arr[0])+String.valueOf(arr[1]));
    }    
}
