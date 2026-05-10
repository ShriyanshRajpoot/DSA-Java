public class SnakePattern {
    public static void main(String[] args) {
       int[][] arr = {{2,3,4},{3,6,9},{4,6,1},{2,6,5},{3,6,7}};
       for(int i=0;i<arr.length;i++){
        if(i%2==0){
            for(int j=0;j<arr[0].length;j++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        else{
            for(int j=arr[0].length-1;j>=0;j--){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
       } 
    }
}
