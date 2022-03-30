import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class HigherMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;
        double result;
        int[] arr = new int[3];

        while (caseNo <= cases) {
            int i = 0;
            while (i < 3) {
                arr[i] = in.nextInt();
                i++;
            }

            Arrays.sort(arr);

            result = Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2));

            if (result == arr[2]) {
                System.out.println("Case " + caseNo + ": yes");
            } else {
                System.out.println("Case " + caseNo + ": no");
            }
            caseNo++;
        }
    }
}
