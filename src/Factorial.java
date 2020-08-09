import java.util.Scanner;

public class Factorial {
    public static int Z(int N) {
        int exponent = 1;
        int a;
        int s = 0;
        do {
            a = N / (int) Math.pow(5, exponent);
            s += a;
            exponent++;
        } while (a > 0);
        return s;
    }

    public static void main(String[] args) {
        int testCases;
        Scanner scanner = new Scanner(System.in);
        testCases = scanner.nextInt();
        while (testCases > 0) {
            int N = scanner.nextInt();
            System.out.println(N);
            testCases--;

        }
    }
}
