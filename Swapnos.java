import java.util.Scanner;

public class Swapnos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A");
        int A = sc.nextInt();

        System.out.println("Enter the value of B");
        int B = sc.nextInt();

        System.out.println("Before Swap A = " + A + " , B = " + B  );

        int temp = A ;
        A = B;
        B = temp;

        System.out.println("After swapping A = " + A + " B = " + B);

        A = A + B ;
        B = A - B;
        A = A - B ;

        System.out.println("After swapping A = " + A + "B = " + B);

        sc.close();
    }
}
