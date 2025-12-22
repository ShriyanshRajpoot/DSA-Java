package ArrayLists;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(25);
    arr.add(12);
    arr.add(10);
    arr.add(20);
    arr.add(5);

    System.out.println(arr.get(2)); // arr[2];
    arr.set(2,50); // arr[2]=50;

    System.out.println(arr);
    int n = arr.size(); // arr.length
    for(int i=0;i<n;i++){
        System.out.println(arr.get(i)+" ");
    }
    for(int ele : arr){
        System.out.println(ele);
    }
}
}
