

import java.util.Scanner;

class ArmstrongNumber{

    public static void main (String [] agrs){
        Scanner input = new Scanner (System.in);
        System.out.println("Wlecome to Armstrong Family");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your Number is Armstrong Number");
        } else {
            System.out.println("Your Number is Not an Armstrong Number");
        }
    }
    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num>0){
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber  += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }
    public static int pow(int num1 , int num2){
        int result = 1;
        int i = 0;
        while (i<num2){
            result = result * num1;
            i++;
        }
        return result;

    }
        public static int noOfDigits(int num){
            int digits = 0;
            while (num > 0){
                digits++;
                num = num / 10;
            }
            return digits;
        }

        
    }
