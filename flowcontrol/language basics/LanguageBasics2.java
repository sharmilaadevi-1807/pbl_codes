/*
Write a Program to accept a String
as a command line argument and print
a Welcome message as given below.
*/
public class LanguageBasics2 {
    public static void main(String args[]) {
        String s = args[0];
        System.out.println("Welcome "+s);
    }
}