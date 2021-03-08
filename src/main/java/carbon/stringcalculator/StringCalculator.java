package carbon.stringcalculator;

import java.util.Arrays;

public class StringCalculator {
	
	int add(String input) {

		if(input.isEmpty()) {
			return 0;
		}else {
			return Arrays.stream(input.split(",")).mapToInt(Integer::valueOf).sum();
		}
		
	}
	
}
