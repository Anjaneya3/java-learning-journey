import java.util.Scanner;

public class AddTwoNumbers {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A");
        int A = sc.nextInt();

                System.out.println("Enter the value of B");
                        int B = sc.nextInt();

             int C = A + B;
             System.out.println(C);

             sc.close();
    }
}
