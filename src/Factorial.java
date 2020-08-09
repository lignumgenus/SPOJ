import java.util.Scanner;
/*
 * Created on Sunday, August 9th, 2020
 * Author : Giao Le
 * Description : Factorial Problem on SPOJ. Have to change
 * class name to Main when submiting solution.
 */

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
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases > 0) {
            int N = scanner.nextInt();
            System.out.println(Z(N));
            testCases--;
        }
    }
}
