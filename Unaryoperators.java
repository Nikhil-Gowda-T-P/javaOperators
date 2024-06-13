public class Unaryoperators {
    public void performOperations(int x) {
        System.out.println("Unary Operators:");
        System.out.println("x = " + x);
        System.out.println("++x = " + ++x);  // Pre-increment
        System.out.println("x++ = " + x++);  // Post-increment
        System.out.println("x = " + x);
        System.out.println("--x = " + --x);  // Pre-decrement
        System.out.println("x-- = " + x--);  // Post-decrement
        System.out.println("x = " + x);
    }
    public static void main(String[] args) {
        Unaryoperators unary = new Unaryoperators();
        unary.performOperations(10);
        
        
    } 
}
