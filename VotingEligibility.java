import java.util.Scanner;

public class VotingEligibility {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");
        int Age = sc.nextInt();

        if(Age >= 18 && Age <= 60){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("Not eligible");
        }
      sc.close();
    }
}
