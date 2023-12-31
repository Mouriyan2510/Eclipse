package exper;

	import java.util.Arrays;
	import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

	public class FindEvenNumbers {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Using the isEven predicate to find even numbers
	        Predicate<Integer> isEven = num -> num % 2 == 0;
	        
	        // Filtering the list of numbers using the isEven predicate
	        numbers.stream()
	               .filter(isEven)
	               .forEach(System.out::println);
	    }
	}


