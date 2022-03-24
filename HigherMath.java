import java.util.Scanner;
import java.lang.Math;

public class HigherMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;

        while (caseNo <= cases) {
            double a = Math.pow(in.nextInt(), 2);
            double b = Math.pow(in.nextInt(), 2);
            double c = Math.pow(in.nextInt(), 2);

            if ((a + b) == c) {
                System.out.println("Case " + caseNo + ": yes");
            } else {
                System.out.println("Case " + caseNo + ": no");
            }

            caseNo++;
        }
    }
}
