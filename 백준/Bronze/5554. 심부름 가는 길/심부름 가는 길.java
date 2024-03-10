import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int homeToSchool = Integer.parseInt(br.readLine());
        int schoolToPc = Integer.parseInt(br.readLine());
        int pcToAcademy = Integer.parseInt(br.readLine());
        int AcademyToHome = Integer.parseInt(br.readLine());

        System.out.println((homeToSchool + schoolToPc + pcToAcademy + AcademyToHome) / 60);
        System.out.println((homeToSchool + schoolToPc + pcToAcademy + AcademyToHome) % 60);
    }
}