import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws Exception{

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }    

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String word = br.readLine();

        for(int i = 0; i < word.length(); i++){
            int now = word.charAt(i);

            if(prev != now){
                if(check[now - 'a'] == false){
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }
}
