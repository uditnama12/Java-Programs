package Array;

import java.util.Scanner;

public class SumAndAverageArray {
  
    public static void main(String[] args) {
    //  Scanner input = new Scanner(System.in);
    // System.out.println("Welcome to Sum and Average of Array");
    // System.out.print("Please enter the number of elements: ");
    // int size = input.nextInt();
    // int[] nums = new int[size];
    // int i = 0;
    // while(i < size){
    //     System.out.println("Please enter element number" + (i+1) + ": ");
    //     nums[i] = input.nextInt();
    //     i++;
    // }

    System.out.println("Welcome to Sum and Average of Array");
    int[] numArray = ArrayUtility.inputArray();
    long sum = sum(numArray);
    int average = average(numArray);
    System.out.println("Sum of the numbers is : " +sum);
    System.out.println("Avergae of the numbers is : " +average);


    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
        sum = sum + numArray[i]; 
        i++;
        }
        return sum;
    }
     
    public static int average(int[] numArray){
        long sum = sum(numArray);
        
        return (int) (sum/numArray.length);
    }
}
