import java.util.Scanner;

public class Sumofnums {
    public static void main(String[] args){
        int sum =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("how many limit numbers values");
        int limit =sc.nextInt();

        for(int i = 1; i<=limit; i++ ){
            System.out.println("enter the num " + i );
            int num = sc.nextInt();
            sum = sum + num;

            
        }

                    System.out.println(sum);

        sc.close();
    }
    
}
