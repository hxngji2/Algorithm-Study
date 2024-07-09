import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int empty = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
    int newOne = Integer.parseInt(st.nextToken());

    int count = 0;
    while(empty >= newOne){
      int mok = empty/newOne;
      count += mok;
      empty = mok + (empty % newOne);
    }
    System.out.println(count);
  }
}
