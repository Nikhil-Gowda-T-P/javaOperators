public class arithmetic {
    public void performOperations(int a, int b) {
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.performOperations(10, 2);
        
    }    
}
