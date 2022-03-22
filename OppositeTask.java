import java.util.Scanner;

class OppositeTask {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(), n;
        for (int i = 1; i <= T; i++) {
            n = scanner.nextInt();
            if (n > 10) {
                System.out.printf("10 %d\n", (n - 10));
            } else {
                System.out.printf("0 %d\n", n);
            }
        }
    }
}