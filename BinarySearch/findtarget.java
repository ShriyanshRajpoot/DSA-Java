public class findtarget {
    public static void main(String[] args) {
        int[] arr = {2,4,7,10,14,19,22,24,27,30,32};
        int target = 7;
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) {
                System.out.println("the target element is present in array : "+arr[mid]);
                    break;
            }
            else if(arr[mid]<target) low = mid+1;
            else  high = mid-1;
        }    
    }
}
