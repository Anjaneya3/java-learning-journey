import java.util.Scanner;

public class Largestno3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A ");
        int A = sc.nextInt();

        System.out.println("Enter the value of B ");
        int B = sc.nextInt();

        System.out.println("Enter the value of C ");
        int C = sc.nextInt();

        if( A <= B ){
            System.out.println("B is bigger");
        }else if(B <= C){
                System.out.println("C is bigger");

        }else{
                System.out.println(" A is bigger");

        }

     sc.close();
   }
}
