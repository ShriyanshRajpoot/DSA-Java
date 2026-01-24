public class LogarithmicTime {
    public static void main(String[] args) {
        int n = 16;
        // Divide by 2 each step
        while (n > 1) {
            n = n / 2;
            System.out.print(n+" "); // O(log n)
        }
    }
}

