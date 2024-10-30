import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String pwd = br.readLine();

            if(pwd.equals("end")) break;

            if(isAcceptable(pwd)){
                sb.append(String.format("<%s> is acceptable.", pwd));
            } else {
                sb.append(String.format("<%s> is not acceptable.", pwd));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isAcceptable(String pwd){
        return includeVowel(pwd) && !isSerial(pwd) && !isSame(pwd);
    }

    public static boolean includeVowel(String pwd){
        for(int i = 0; i < pwd.length(); i++){
            char c = pwd.charAt(i);
            if(isVowel(c)) return true;
        }
        return false;
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
    }

    public static boolean isSerial(String pwd){
        for(int i = 0; i <= pwd.length()-3; i++){
            char a = pwd.charAt(i);
            char b = pwd.charAt(i+1);
            char c = pwd.charAt(i+2);

            if(isVowel(a) && isVowel(b) && isVowel(c)) return true;
            if(isConsonant(a) && isConsonant(b) && isConsonant(c)) return true;
        }
        return false;
    }

    public static boolean isConsonant(char c){
        return !isVowel(c);
    }

    public static boolean isSame(String pwd){
        for(int i = 0; i <= pwd.length()-2; i++){
            char a = pwd.charAt(i);
            char b = pwd.charAt(i+1);
            if(a==b && a!='e' && a!='o') return true;
        }
        return false;
    }
}
