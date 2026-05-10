public class ForEachLoop {
    public static void main(String[] args) {
       int[][] arr = {{2,3,4},{3,6,9},{4,6,1},{2,6,5}};
    /*    for (int[] a : arr) {
           for (int ele : a) {
              System.out.print(ele+" ");
           }
           System.out.println();
       }  */
        
           for(int i=0;i<arr.length;i++){
            for (int ele : arr[i]) {
            System.out.print(ele+" ");
        }  
        System.out.println(); 
           }
        
    }
}
