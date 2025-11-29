import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter Length : ");
       int l = sc.nextInt();
       System.out.print("Enter Breadth : ");
       int b =  sc.nextInt();
       int a = l*b;
       System.out.println("area is : "+a);
       int p = 2*(l+b);
       System.out.println("perimetr is : "+p);
       if(a>p)
          System.out.print("area is greater");
       else
       System.out.print("perimeter is greater");
       sc.close();

    }
}
