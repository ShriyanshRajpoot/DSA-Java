import java.util.Arrays;

public class LinearithmicTime {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        // Sorting uses O(n log n)
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}

