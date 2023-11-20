import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class anonymousFunctions {
    public static void main(String args[])
    {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // Anonymous func 1 - square of n
        Function<Integer, Integer> squareFunc = (n) -> n * n;

        // Anonymous func 2 - double of n
        Function<Integer, Integer> doubleFunc = (n) -> 2 * n;

        // Original Numbers
        System.out.println("Original numbers: " + numbers);

        // Demonstrating square function
        System.out.println("Squared numbers: " + applyFunctionToAll(numbers,squareFunc));

        // Demonstrating double function
        System.out.println("Doubled numbers: " + applyFunctionToAll(numbers,doubleFunc));
    }

    // Method to apply function to all elements of the list
    private static List<Integer> applyFunctionToAll(List<Integer> numbers, Function<Integer, Integer> functions) {
        return numbers.stream().map(functions).toList();
    }
}