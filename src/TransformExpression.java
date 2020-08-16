/*
* Created on : Sunday, August 16, 2020
* Author : Giao Le
* */

import java.util.Scanner;
import java.util.Stack;

public class TransformExpression {
    public static String RPN(String expression) {
        String rpn = "";
        Stack stack = new Stack();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch (c) {
                case '(':
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    stack.push(c);
                    break;
                case ')':
                    rpn += stack.pop();
                    break;
                default:
                    rpn += c;
                    break;
            }
        }
        return rpn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            System.out.println(RPN(scanner.next()));
        }
    }
}
