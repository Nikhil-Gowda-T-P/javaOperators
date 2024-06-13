public class Logicaloperators {

    public void performOperations(boolean p, boolean q) {
        System.out.println("Logical Operators:");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + !p);
    }
    public static void main(String[] args) {
        Logicaloperators lo = new Logicaloperators();
        lo.performOperations(true, true);
        
}}
