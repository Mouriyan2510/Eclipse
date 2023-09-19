package exper;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fi {
	public static void main(String[] args) {
		Function<String, Integer> fun = a -> a.length();
		System.out.println(fun.apply("Mouri"));

		Consumer<String> con = a -> System.out.println(a.length());
		con.accept("Mouri");
		
		Supplier<String>sup=()-> "mo";
		System.out.println(sup.get());
		
		Predicate<Integer>pre=a-> a%2==0;
		System.out.println( pre.test(10));
	}

}
