package exper;
import java.util.HashMap;
import java.util.Map;
public class Tryy {
	

	    public static void main(String[] args) {
	        Map<Integer, String> inputMap = new HashMap<>();
	        inputMap.put(3, "apple");
	        inputMap.put(5, "watermelon");
	        inputMap.put(10, "Orange");
	        inputMap.put(2, "gig");

//	        for (String value : inputMap.values()) {
//	            System.out.print((value) + ", ");
//	        }
	        
	        for(Integer z:inputMap.keySet()) {
				System.out.println(z+"-"+inputMap.get(z));
			}
	        
	    }

	    
	}


