import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();

        str = str.replace("XXXX", "AAAA");
        str = str.replace("XX", "BB");
        sb.append(str);

        if(str.contains("X")){
            sb.delete(0, str.length());
            sb.append(-1);
        }

        System.out.println(sb);
    }
}
