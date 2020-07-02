//Write a program to reverse a given number and print

import java.util.Scanner;

public class FlowControl17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inp = sc.nextInt();
        int op = 0;
        int i = (int) Math.pow(10, String.valueOf(inp).length() - 1);

        while (inp != 0) {
            int digit = inp % 10;
            op += digit * i;
            i /= 10;
            inp /= 10;
        }

        System.out.println(op);

        sc.close();
    }

}