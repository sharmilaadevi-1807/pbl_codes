// Write a program to initialize an integer array and print the sum and average of the array.

public class Arrays1 {
    public static void main(String[] args) {
        int s=0,avg;
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        for(int i:x) {
            s+=i;
        }
        avg=s/x.length;
        System.out.println("Sum = "+s);
        System.out.println("Average = "+avg);
    }
}