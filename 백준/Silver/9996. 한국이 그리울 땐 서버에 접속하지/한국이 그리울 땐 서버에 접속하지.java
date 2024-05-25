import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] pattern = br.readLine().split("\\*");

        String fileName;

        for(int i = 0; i < N; i++){
            fileName = br.readLine();

            if(pattern[0].length() + pattern[1].length() > fileName.length()){
                System.out.println("NE");
                continue;
            }

            String front = fileName.substring(0, pattern[0].length());
            String back = fileName.substring(fileName.length()-pattern[1].length(), fileName.length());

            if(front.equals(pattern[0]) && back.equals(pattern[1])){
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
