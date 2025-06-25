package Array;

public class Array1 {
     
    public static void main(String[] args) {
        
        //first type of array declaration
        // int[] arr =  new int[5];
        // arr[0] = 53;
        // arr[3] = 97;
        // arr[1] = 62;
        // arr[4] = 69;
        // arr[2] = 100;
         

        //Second type of array declaration
        int[] arr = {53,45,64,67,54};
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        //using loop to print the array values:
        //int index = 0;
        // while(index<5){
        //     System.out.println(arr[index]);
        //     index++;
        // }

        //when you don't know the lenght of the array than:

        int index = 0;
        while (index< arr.length) {
            System.out.println(arr[index]);
            index++;
            
        }
        


    }
}
