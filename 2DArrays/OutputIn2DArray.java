public class OutputIn2DArray {
     public static void main(String[] args) {
    //  int[][] arr = new int[3][4];
        int[][] arr = {{2,3,4,5},{3,7,9,4},{4,9,0,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }
}
