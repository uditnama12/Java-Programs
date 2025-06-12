//convert fahrenheit to celsius
import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double f = input.nextDouble();

        double c = (f-32) * 5 / 9;
        System.out.print("The temperature in Celsius is: ");
        System.out.println(c);  
 
    }
    
}
