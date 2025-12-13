import java.util.Scanner;

public class ZigZagVerticalSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int left = 1;
        int right = n;

        while (left <= right) {
            System.out.println(left);
            if (left != right) {
                System.out.println(right);
            }
            left++;
            right--;
            sc.close();
        }
    }
}
