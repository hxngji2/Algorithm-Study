import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if ((a + b) % 2 != 0 || a < b)
            System.out.println(-1);
        else
            sb.append((a+b)/2).append(" ").append(((a + b) / 2 - b));
            System.out.println(sb.toString());
//            System.out.print((a + b) / 2 + " " + ((a + b) / 2 - b));
    }
}