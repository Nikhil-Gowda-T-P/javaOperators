public class minimumNumber {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 5};

        // Calculate minimum using conditional operator
        int min = (array[0] < array[1]) ? (array[0] < array[2] ? (array[0] < array[3] ? array[0] : array[3]) : (array[2] < array[3] ? array[2] : array[3])) : (array[1] < array[2] ? (array[1] < array[3] ? array[1] : array[3]) : (array[2] < array[3] ? array[2] : array[3]));

        // Print the minimum number
        System.out.println("Minimum number in the array: " + min);
    }
    

}
