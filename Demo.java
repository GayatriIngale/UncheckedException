package UncheckedException;

import java.util.Optional;

public class Demo {
	
	public static void  main(String args[]) throws Exception {
		
		String s = null;
		Optional<String> checkstr = Optional.ofNullable(s);
		if(checkstr.isPresent()) {
			System.out.println(s.charAt(1));
		}
		else
			System.out.println("String is null");
		
		
	}

}
