import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A == 1){
            if(B == 2){
                sb.append("B");
            } else {
                sb.append("A");
            }
        } else if(A == 2){
            if(B == 1){
                sb.append("A");
            } else {
                sb.append("B");
            }
        } else {
            if(B == 1){
                sb.append("B");
            } else {
                sb.append("A");
            }
        }
        System.out.println(sb);
    }    
}
