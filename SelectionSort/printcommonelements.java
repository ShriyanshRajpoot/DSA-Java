import java.util.ArrayList;
import java.util.Arrays;

public class printcommonelements {
    public static void main(String[] args) {
        int[] a = {3,5,7,2,9,0,1};
        int[] b = {7,8,4,5,6,2,1};
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){ 
            ans.add(a[i]);
            i++; 
            j++;
            }
        else if (a[i]<b[j]) { i++;
        }
        else{ j++;
            }   
        }
        System.out.print("Common Elements : "+ ans);
    }
}
