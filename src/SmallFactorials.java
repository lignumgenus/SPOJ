/*
* Created on Monday, August 10, 2020
* Author : Giao Le
* */

import java.util.Scanner;

public class SmallFactorials {
    public static int factorials(int N) {
        if (N > 1) {
            return N * factorials(N - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases-- > 0) {
            System.out.println(factorials(scanner.nextInt()));
        }
    }
}
