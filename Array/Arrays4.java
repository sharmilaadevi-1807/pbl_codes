// Initialize an integer array with ascii values and print the corresponding character values in a single row.

public class Arrays4 {
    public static void main(String[] args) {
        int[] ascii = {58,94,67,87,90,84};
        for (int i:ascii) {
            System.out.printf("%c ",i);
        }
    }
}