import java.util.Scanner;

public class MultiplicationNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Loop runs from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Prints exactly in the 'num * i = result' format
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        sc.close();
    }
}