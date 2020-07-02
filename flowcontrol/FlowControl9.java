// Write a program to receive a number and print the corresponding month name.

public class FlowControl9 {
    public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    switch (m) {
    case 1:
        System.out.println("January");
        break;
    case 2:
        System.out.println("Febuary");
        break;
    case 3:
        System.out.println("March");
        break;
    case 4:
        System.out.println("April");
        break;
    case 5:
        System.out.println("May");
        break;
    case 6:
        System.out.println("June");
        break;
    case 7:
        System.out.println("July");
        break;
    case 8:
        System.out.println("August");
        break;
    case 9:
        System.out.println("Spetember");
        break;
    case 10:
        System.out.println("October");
        break;
    case 11:
        System.out.println("November");
        break;
    case 12:
        System.out.println("December");
        break;
    }
    }
}