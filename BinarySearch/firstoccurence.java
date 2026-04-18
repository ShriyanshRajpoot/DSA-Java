public class firstoccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,7,7,7,10,14,19,22,24,27,30,32};
        int target = 7;
        int index = -1;
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) {
                index = mid;
                high = mid-1;
            }
            else if(arr[mid]<target) low = mid+1;
            else  high = mid-1;
        } 
        if(index!=-1){
           System.out.println("the target element is present in array : " + target + " the index number is : "+index); 
        }
        else{
            System.out.println("the target element is missing in array");
        }
    }
}

