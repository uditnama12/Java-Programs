package Array;

public class Array2 {
    public static void main(String[] args) {
        // int [][] arr = new int[5][5];
        // arr[0][0] = 1;
        // arr[0][1] = 4;
        // arr[1][0] = 6;
        // arr[1][1] = 2;

        // System.out.println(arr[1][1]);
        // System.out.println(arr[0][0]);
        // System.out.println(arr[1][0]);
        // System.out.println(arr[0][1]);


        int[][] arr = {{1,2,3},{6,7,9 },{4,9,0}};
        //System.out.println(arr[0].length);


        //Traversal of array
        int i = 0;
        while(i<arr.length){
            
            int j =0;
            while(j<arr[i].length){
               System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
            
        }



    }
}
