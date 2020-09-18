/*
* Created on : Tuesday, August 18, 2020
* */

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            num = scanner.nextInt();
            if(num != 42){
                System.out.println(num);
            }
        } while (num != 42);
    }
}
