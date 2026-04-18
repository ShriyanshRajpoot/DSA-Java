import java.util.ArrayList;

public class firstandlastoccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,7,7,7,10,14,19,22,24,27,30,32};
        int target = 7;

        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(firstIndex);
        result.add(lastIndex);

        System.out.println("First and Last Occurrence of " + target + ": " + result);
    }

    // Function to find first occurrence
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                high = mid - 1; // keep searching left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    // Function to find last occurrence
    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                low = mid + 1; // keep searching right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
