import java.util.Scanner;
import java.lang.Math;

public class HigherMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;

        while (caseNo <= cases) {
            double a = in.nextInt();
            double b = in.nextInt();
            double c = in.nextInt();

            double result_c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            boolean first_match = result_c == c;

            double result_b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            boolean second_match = result_b == b;

            double result_a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            boolean third_match = result_a == a;

            if (first_match && second_match && third_match) {
                System.out.println("Case " + caseNo + ": yes");
            } else {
                System.out.println("Case " + caseNo + ": no");
            }

            caseNo++;
        }
    }
}
