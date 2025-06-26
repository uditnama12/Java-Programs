
package Array;
import java.util.Scanner;


public class Occurrences {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences ");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Please enter the number which you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArray, num);
        System.out.println("Your Number is found " + occurrences +" times in the array ");
    }

    public static int noOfOccurrences(int[] numArr , int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length ){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
