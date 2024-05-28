import java.io.*;
import java.util.*;

public class Main {
    static int[] dat;
    static int pos = 0;

    static void push(int x){
        dat[pos++] = x;
    }

    static int pop() {
        if(pos == 0){
            return -1;
        } else{
            // return pos--;
            int res = dat[pos-1];
            dat[pos-1] = 0;
            pos--;
            return res;
        }

    }

    static int top(){
        if(pos == 0){
            return -1;
        } else
            return dat[pos-1];
    }

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        dat = new int[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
                case "size":
                    sb.append(pos).append("\n");
                    break;
                case "empty":
                    if(pos == 0){
                        sb.append(1).append("\n");
                    } else 
                        sb.append(0).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
