import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Sum of Digits Calculator");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of Digits is: " + sum );
    }
    
     public static int sumOfDigits(int num){
        int sum = 0;
         while(num>0){
            sum = sum + (num % 10);
            num = num / 10;   
              }
              return sum;
     }
}
