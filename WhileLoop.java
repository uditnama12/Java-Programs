public class WhileLoop {

    public static void main(String[] args) {
        int row= 0;
        while (row<25){
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
    
}
