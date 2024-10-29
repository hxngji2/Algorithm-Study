import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 플레이 신청 횟수
        char type = st.nextToken().charAt(0);

        HashSet<String> players = new HashSet<>();

        for (int i = 0; i < N; i++) {
            players.add(br.readLine());
        }

        switch (type) {
            case 'Y':
                System.out.println(players.size());
                break;
            case 'F':
                System.out.println(players.size() / 2);
                break;
            case 'O':
                System.out.println(players.size() / 3);
                break;
            default:
                break;
        }

    }
}
