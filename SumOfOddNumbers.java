import java.util.Scanner;
public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Sum of all the odd numbers ");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
         System.out.print("OddSum till " + num + " is: " + sum);

    }

public static int oddSum(int num){
    int sum = 0;
    int i = 1;
     while(i<=num){
        sum += i;
        i +=  2;
       
        
     }
     return sum;
    }
}



