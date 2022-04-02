import java.util.Scanner;

// The Last Digit Problems
public class Main {
    public static int calculatePower(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            int temporary = calculatePower(a, b / 2) % 10;
            return (temporary * temporary);
        }
        return a * (calculatePower(a, b - 1) % 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        while (c-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int r = calculatePower(a, b) % 10;
            System.out.println(r);
        }
    }
}
