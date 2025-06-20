import java.util.Scanner;

public class PalindromeNUmber {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number Checker");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean palindrome = isPalindrome(num);
        if(palindrome){
            System.out.println("Your Number is a Palindrome Number");
        } else {    
            System.out.println("Your Number is Not a Palindrome Number");
        }
    }

        public static boolean isPalindrome(int num){
            return num == reverse(num);
        }

        public static int reverse(int num){
            int reversed = 0;
            while(num > 0){
                reversed = reversed * 10 + (num % 10);
                num = num / 10;
            }
            return reversed;

        }

}
