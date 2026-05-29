import java.util.Scanner;

public class EvenorOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int totalnums= sc.nextInt();
        System.out.println();

     for(int i = 1; i <= totalnums; i++){

        System.out.println("Enter the " + i + ":");
        int num = sc.nextInt();

         if(num % 2 == 0){
            System.out.println("number is even");
          }else{
            System.out.println("Number is odd");
          }

        }   
                 sc.close();

    }
}
