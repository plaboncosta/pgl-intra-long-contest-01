import java.util.Scanner;

public class Fibsieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;
        int[][] dataSet = {
                {1, 4, 5, 16, 17},
                {2, 3, 6, 15, 18},
                {9, 8, 7, 14, 19},
                {10, 11, 12, 13, 20},
                {25, 24, 23, 22, 21},
        };

        while (caseNo <= cases) {
            int input = in.nextInt();

            for (int row = 0; row < dataSet.length; row++) {
                for (int column = 0; column < dataSet[row].length; column++) {
                    if (input == dataSet[row][column]) {
                        System.out.println("Case " + caseNo + ": " + (column + 1) + ' ' + (row + 1));
                    }
                }
            }

            caseNo++;
        }
    }
}
