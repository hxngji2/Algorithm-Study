import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);
        int num = (int) ch;

        if ((num >= 97 && num <= 122) || (num >= 65 && num <= 90) || (num >= 48 && num <= 57)) {
            System.out.println(num);
        }
    }
}