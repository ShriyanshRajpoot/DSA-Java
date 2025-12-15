public class ForEachloop {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,1};
        for(int ele : arr){
            ele *= 2;
            System.out.print(ele+" ");
        }
    }
}
