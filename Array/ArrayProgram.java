//Array searching
package Array;
import java.util.Scanner;

public class ArrayProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] arr = {91, 56, 62, 10, 45, 78, 36, 26, 44, 9, 11};
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr , num);
        if(isFound){
            System.out.println("Your Number was found in the array");
        }else{
            System.out.println("Your Number is not found in the array");
        }

    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length) {
            if(arr[index] == num){
                return true;
            }
            index++;
            
        }
        return false;
    }
    
}
