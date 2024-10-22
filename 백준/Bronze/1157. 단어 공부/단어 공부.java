import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                arr[str.charAt(i)-'a']++;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                arr[str.charAt(i)-'A']++;
            }
        }

        int index = 0;
        boolean flag = false;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[index]){
                flag = true;
            } else if(arr[i] > arr[index]){
                index = i;
                flag = false;
            }
        }

        if(flag == true) {
            System.out.println("?");
        } else {
            System.out.println((char)(index + 'A'));
        }
    }
}
