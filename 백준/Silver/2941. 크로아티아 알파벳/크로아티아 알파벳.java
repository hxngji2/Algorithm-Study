import java.io.*;
import java.util.*;

public class Main {
    static String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        for(int i = 0; i < alphabet.length; i++){
            if(word.contains(alphabet[i])){
                word = word.replace(alphabet[i],"!");
            }
        }
        System.out.println(word.length());
    }    
}
