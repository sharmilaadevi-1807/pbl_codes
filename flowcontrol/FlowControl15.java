// Write a program to print the sum of all the digits of a given number.

import java.util.Scanner;
public class FlowControl15 {
   static int getSum(int n)
    {
        int sum;
        for (sum = 0;
             n > 0;
             sum += n % 10,
             n /= 10);
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(getSum(n));
    }
}