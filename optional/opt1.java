package optional;

import java.util.Optional;

public class opt1 {
	
	public static void main(String args[]) {
		String[] str = new String[10];
		
	
		
		Optional<String> check = Optional.ofNullable(str[5]);
		
		if(check.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		}
		else {
			System.out.println("String value is not present");
		}
	}

}
