// Write a Java program to find if the given number is prime or not.

public class FlowControl14 {

    static void checkPrime(int n) {
        int m=0,flag=0;
        m=n/2;
        if(n==0||n==1) {
            System.out.println(n+" is not a prime number");
        }
        else {
            for(int i=2;i<=m;i++) {
                if(n%i==0) {
                    System.out.println(n+" is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(n+ " is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(args.length == 0) {
            System.out.println("No Values");
            System.exit(0);
        }
        else {
            checkPrime(n);
        }
    }
}