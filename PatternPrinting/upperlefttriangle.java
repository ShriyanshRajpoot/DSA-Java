import java.util.Scanner;

public class upperlefttriangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=1+n-i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
            }
            sc.close();
        }
    }
 
