public class UnaryOperator {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        // Example of Unary Operators in Java
        // Unary operators are operators that operate on a single operand.
    
        // Unary Operators
        System.out.println("Unary Operators:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Increment operator
        System.out.println("Increment operator:");
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("++b = " + (++b)); // Pre-increment

        // Decrement operator
        System.out.println("Decrement operator:");
        System.out.println("b-- = " + (b--)); // Post-decrement
        System.out.println("--a = " + (--a)); // Pre-decrement

        // Logical NOT operator
        boolean flag = true;
        System.out.println("Logical NOT operator:");
        System.out.println("!flag = " + (!flag));
    }
     
} 
