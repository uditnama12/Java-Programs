import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Factorial Calculator");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
         long fact = factorial(num);
         System.out.println("Factorial is: " + fact);
}

    public static long factorial(int num){
        if(num<2){
            return 1; // base case for factorial
        }
         int i =1;
         long fact = 1;
         while(i<=num){
            fact = fact * i ;
            i++;
         }
         return fact;
    }
}
