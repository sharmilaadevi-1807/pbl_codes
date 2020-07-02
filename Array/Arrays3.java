// Write a program to initialize an integer array with values and check if a given number is present in the array or not.

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5,6,7,8,9};
        int index = -1;
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == number) {
                index = i+1;
                break;
            }
        }
        System.out.println(index);
    }
}