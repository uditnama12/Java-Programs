//Calcualte simple interest and compound interest
import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Principal amount: ");
        double p = input.nextDouble();
        
        System.out.print("Enter the Rate of interest: ");
        double r = input.nextDouble();
        
        System.out.print("Enter the Time period in years: ");
        double t = input.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (p * r * t) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        
        // Calculate Compound Interest
        double compoundInterest = p *((1 + r / 100)*t);
        System.out.println("The Compound Interest is: " + compoundInterest);
    }
    
}
