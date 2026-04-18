public class searchanelementinrotatedarray {
    static int search(int arr[], int tar ){
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==tar) return mid;
            if(arr[lo]<arr[mid]){
                if(arr[lo]<=tar && tar<arr[hi]) hi = mid-1;
                else lo = mid+1;
            }
            else{
              if(arr[mid]<tar && tar<=arr[hi]) lo = mid+1;
              else hi = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        if (result != -1) {
            System.out.print("Element found at index: " + result);
        } else {
            System.out.print("Element not found");
        }
    }

}
