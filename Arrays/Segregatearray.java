public class Segregatearray {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,0,1,1,1};
        int noz = 0;
        int no1 = 0;
        for (int ele : arr) {
         if(ele==0) noz++;
         else no1++;
        }
        for(int i=0;i<noz;i++){
            arr[i]=0;
        }
        for(int i=noz;i<arr.length;i++){
            arr[i]=1;
        }
        for (int ele : arr) {
            System.out.print(ele);
        }
    }
}
