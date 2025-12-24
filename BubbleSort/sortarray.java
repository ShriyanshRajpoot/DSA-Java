public class sortarray {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,-2,-1};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        for(int i=0;i<n-1;i++){
            int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;    
        }
            System.out.println();
            for (int ele : arr) {
            System.out.print(ele+" ");
            }
    }
}
