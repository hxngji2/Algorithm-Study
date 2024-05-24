import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();

        ArrayDeque<Character>deque = new ArrayDeque<>();
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == '<'){
                int j = i;
                while(word.charAt(j)!='>'){
                    sb.append(word.charAt(j));
                    j++;
                }
                sb.append('>');
                i=j;
            }
            else if(word.charAt(i)==' '){
                sb.append(' ');
            }
            else {
                int j = i;
                while(j < word.length() && word.charAt(j) != ' ' && word.charAt(j) != '<'){
                    deque.addLast(word.charAt(j));
                    j++;
                }
                int k = deque.size();
                for(int q = 0; q < k; q++){
                    sb.append(deque.pollLast());
                }
                i = j-1;
            }
        }
        System.out.println(sb);
    }    
}
