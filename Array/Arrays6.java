// Write a program to initialize an array and print them in a sorted order.
import java.util.Arrays;
public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = {4,9,8,3,0,1,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}