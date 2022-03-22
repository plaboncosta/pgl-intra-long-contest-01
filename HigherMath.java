import java.util.Scanner;
import java.lang.Math;

public class HigherMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;

        while (caseNo <= cases) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if ((a >= 1 && a <= 40000) && (b >= 1 && b <= 40000) && (c >= 1 && c <= 40000)) {
                if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                    System.out.println("Case " + caseNo + ": yes");
                } else {
                    System.out.println("Case " + caseNo + ": no");
                }
            } else {
                System.out.println("Case " + caseNo + ": no");
            }

            caseNo++;
        }
    }
}
