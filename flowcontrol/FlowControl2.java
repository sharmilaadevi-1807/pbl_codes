/*
 Write a program to check if a given integer number is odd or even.
 */

public class FlowControl2 {
    public static void main(String[] args) {
    int number = Integer.parseInt(args[0]);
    if(number%2 ==0) {
        System.out.println(number+" is an Even Number");
    }
    else {
        System.out.println(number+" is a Odd Number ");
    }
    }
}