import java.util.Scanner;

public class GreetingsFromLightOj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int caseNo = 0; caseNo < cases; caseNo++) {
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("Case " + (caseNo + 1) + ": " + (a + b));
        }
    }
}
