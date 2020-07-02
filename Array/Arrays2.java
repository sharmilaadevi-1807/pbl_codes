// Write a program to initialize an integer array and find the maximum and minimum value of the array.


public class Arrays2 {
    public static void main(String[] args) {
        int[] arr  = {5,2,1,3,4,9,8,6};
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
    }
}