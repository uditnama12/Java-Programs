import java.util.Scanner;
public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean prime = isPrime(num);
        if(prime){
            System.out.println("Your Number is Prime Number");
        } else {    
            System.out.println("Your Number is Not a Prime Number");
        }

    }

    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num % i ==0){
                return false;
            }
            i++;
        }
        return true;
    }

    }

