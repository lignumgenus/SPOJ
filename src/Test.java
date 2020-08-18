import java.util.Scanner;

public class Test {
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
