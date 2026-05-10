public class Snake2 {
    public static void main(String[] args) {
       int[][] arr = {{2,3,4},{3,6,9},{4,6,1},{2,6,5},{3,6,7}};
       for(int j=0;j<arr[0].length;j++){
        if(j%2==0){
            for(int i=0;i<arr.length;i++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        else{
            for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
       } 
    }
}
