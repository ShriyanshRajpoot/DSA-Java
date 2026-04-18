public class elementinsortedmatrix {
    public boolean searchmatrix(int[][] arr,int tar) {
        int row = arr.length, col = arr[0].length;
        int lo = 0, hi = row*col-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midrow = mid/col, midcol = mid%col;
            if(arr[midrow][midcol]==tar) return true;
            else if(arr[midrow][midcol]>tar) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    } 
    public static void main(String[] args) {
        elementinsortedmatrix obj = new elementinsortedmatrix();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        System.out.println(obj.searchmatrix(matrix, 3));   // true
        System.out.println(obj.searchmatrix(matrix, 13));  // false
        System.out.println(obj.searchmatrix(matrix, 60));  // true
        System.out.println(obj.searchmatrix(matrix, 1));   // true
        System.out.println(obj.searchmatrix(matrix, 100)); // false
    }

}
