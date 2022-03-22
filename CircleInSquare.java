import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleInSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 0;

        double pi = 2 * Math.acos(0.0);

        while (caseNo < cases) {
            double radius = in.nextDouble();

            double box_area = (2 * radius) * (2 * radius);
            double circle_area = pi * (radius * radius);

            DecimalFormat dec = new DecimalFormat("#0.00");

            System.out.println("Case " + (caseNo + 1) + ": " + dec.format(box_area - circle_area));

            caseNo++;
        }
    }
}
