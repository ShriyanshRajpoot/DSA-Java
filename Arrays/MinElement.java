public class MinElement {
    public static void main(String[] args) {
        
        int[] arr = {3,4,2,-1,6,7,-2};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Minimum Element is : "+min);
    }   
}
