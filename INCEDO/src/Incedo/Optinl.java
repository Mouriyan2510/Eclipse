package Incedo;

import java.awt.print.Pageable;
import java.util.Optional;

public class Optinl {
	public static void main(String[] args) {
		String a=null;

		Optional<String>s=Optional.ofNullable(a);
		if(s.isPresent()) {
			System.out.println(a);
		}
		else {
			System.out.println("value ot present");
		}
		System.out.println(s.orElse(a));
		System.out.println(s.orElseThrow());
	}

}
