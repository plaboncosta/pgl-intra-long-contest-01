import java.util.Scanner;

public class Watermelon {
    public static String isEven(int number) {
        if (number >= 1 && number <= 100) {
            if (number != 2 && number % 2 == 0) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            System.out.println(isEven(in.nextInt()));
        }
    }
}
