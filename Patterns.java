import java.util.Scanner;

public class Patterns {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patterns family!");
        System.out.print("Please enter the number of rows: ");
        int row = input.nextInt();
         printRIghtHalfPyramid(row);
         printReverseRightHalfPyramid(row);
         printLeftHalfPyramid(row);
    }
    public static void printRIghtHalfPyramid(int rowMax){
        System.out.println("\n Here is the right half pyramid pattern:");
        int row= 0;
        while (row<rowMax){
            System.out.print("*");
            int col = 0;
            while (col<row){ 
                System.out.print(" *");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void printReverseRightHalfPyramid(int rowMax){
        System.out.println("Here is the Reverse Right half pyramid pattern:\n");
        int row = rowMax;
        while (row>0){
            int i = 0;
            while (i<row){
                System.out.print("* ");
                i++;    
            }
            System.out.println();
            row--;
        }
            
        
    }

    
    public static void printLeftHalfPyramid(int rowMax){
        System.out.println("Here is the left half pyramid pattern:\n");
        int row = rowMax;
       while (row >0){
            int j = 0;
            while (j < row - 1){
                System.out.print("  ");
                j++;
            }
            //loop for print starts
            int i = 0;
            while(i <= rowMax - row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
       
            
        
     } 
  }

