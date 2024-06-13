public class assignmentOperators {

    public void performOperations(int z) {
        System.out.println("Assignment Operators:");
        z += 5;
        System.out.println("z += 5: " + z);
        z -= 3;
        System.out.println("z -= 3: " + z);
        z *= 2;
        System.out.println("z *= 2: " + z);
        z /= 4;
        System.out.println("z /= 4: " + z);
        z %= 3;
        System.out.println("z %= 3: " + z);
    }
    public static void main(String[] args) {
        assignmentOperators ao = new assignmentOperators();
        ao.performOperations(10);
    }
}
