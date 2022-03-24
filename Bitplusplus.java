import java.util.Objects;
import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 1;
        int x = 0;

        while (caseNo <= cases) {
            String operation = in.nextLine();

            if (!Objects.equals(operation, "")) {
                String[] arr = operation.split("");

                if (arr.length > 0) {
                    if (Objects.equals(arr[0], "+")) {
                        ++x;
                    } else if (Objects.equals(arr[0], "-")) {
                        --x;
                    } else if (Objects.equals(arr[1], "+")) {
                        x++;
                    } else if (Objects.equals(arr[1], "-")) {
                        x--;
                    }
                }

                caseNo++;
            }
        }

        System.out.println(x);
    }
}
