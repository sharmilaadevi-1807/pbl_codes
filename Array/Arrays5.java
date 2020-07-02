// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class Arrays5 {
    public static void main(String[] args) {
        int[] arr = {9,6,5,4,7,1,3,2};
        int len = arr.length;

        for(int i=0 ; i< len-1; i++) {
            for(int j = 0; j<len -i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("smallest two numbers are : "+arr[0]+" and "+arr[1]);
        System.out.println("Largest two numbers are : "+arr[len-1]+" and "+arr[len-2]);
    }
}