import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num;

        num = scan.nextInt();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < (num/2)-1; i++) {
            System.out.println("*");
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < (num/2); i++) {
            System.out.println("*");
        }

    }
}
