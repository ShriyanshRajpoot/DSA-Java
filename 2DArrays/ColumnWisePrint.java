public class ColumnWisePrint {
     public static void main(String[] args) {
        int[][] arr = {{2,3,4},{3,6,9},{4,6,1},{2,6,5}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }
}
