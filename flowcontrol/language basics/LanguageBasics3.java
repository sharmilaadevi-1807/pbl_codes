/*
Write a Program to accept two integers
as command line arguments and print
the sum of the two numbers
*/
public class LanguageBasics3 {
    public static void main(String args[]) {
        int s = Integer.parseInt(args[0]);
        int s1 = Integer.parseInt(args[1]);
        int sum = s+s1;
        System.out.printf("The sum of %d and %d is %d",s,s1,sum);
    }
}