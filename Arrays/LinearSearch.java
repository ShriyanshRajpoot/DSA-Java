public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,4,6,7,2,9,8};
        int target = 4;
        int found = -789;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found = i;
                break;
            }
        }
        if(found!=-789) System.out.println("target exists in array at index "+found);
        else System.out.println("target missing in array");
    }
}
