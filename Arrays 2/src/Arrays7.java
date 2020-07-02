// Write a program to remove the duplicate elements in an array and print the same.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays7 {
    public static void main(String[] args) {
        int[] array = {1,2,4,3,2,2,4,5,6,8,7,9,87};
        List<Integer> distinctArray = new ArrayList<>();

        for (int item : array) {
            if (!distinctArray.contains(item))
                distinctArray.add(item);
        }

        System.out.println(Arrays.toString(distinctArray.toArray()));
    }
}