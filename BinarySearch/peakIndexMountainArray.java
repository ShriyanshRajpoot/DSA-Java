public class peakIndexMountainArray {
    public int peakIndexInMountainArray(int[] arr) {    
    int lo = 1, hi = arr.length - 2;
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
        else hi = mid-1;
    }
    return -1;
}
public static void main(String[] args) {
        peakIndexMountainArray obj = new peakIndexMountainArray();
        int[] arr = {2, 3, 4, 5, 6, 7, 1};
        System.out.println(obj.peakIndexInMountainArray(arr)); 

}
}