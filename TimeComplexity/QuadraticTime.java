public class QuadraticTime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // Nested loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]); // O(n²)
            }
        }
    }
}
