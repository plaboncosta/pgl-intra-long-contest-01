import java.util.Scanner;

public class Fibsieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;

        while (caseNo <= cases) {
            long seconds, root, lackings, row, column;
            seconds = in.nextLong();

            root = (long) Math.ceil(Math.sqrt(seconds));
            lackings = (long) Math.pow(root, 2) - seconds;

            if (lackings < root) {
                row = root;
                column = lackings + 1;
            } else {
                column = root;
                row = (long) (seconds - (Math.pow(root - 1, 2)));
            }

            if (root % 2 == 0) {
                long temp = column;
                column = row;
                row = temp;
            }

            System.out.println("Case " + caseNo + ": " + column + " " + row);

            caseNo++;
        }
    }
}
