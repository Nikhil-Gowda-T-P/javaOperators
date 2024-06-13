public class Relationaloperators {

    public void performOperations(int a, int b) {
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    public static void main(String [] args){
        Relationaloperators relationalOperators = new Relationaloperators();
        relationalOperators.performOperations(10, 5);
        
    }
    
    
    
}
