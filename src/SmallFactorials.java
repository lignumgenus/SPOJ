/*
 * Created on Monday, August 10, 2020
 * Author : Giao Le
 * */


import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
    public static BigInteger factorials(int N) {
        BigInteger s = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            System.out.println(factorials(scanner.nextInt()));
        }
    }
}
