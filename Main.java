import java.util.Scanner;
// The Last Digit Problems
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        while (c-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            a = a % 10;
            b = (b % 4) + 4;
            int r = (int) (Math.pow(a, b) % 10);
            System.out.println(r);
        }
    }
}
