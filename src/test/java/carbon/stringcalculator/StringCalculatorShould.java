package carbon.stringcalculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculatorShould {
	
	private StringCalculator stringCalculator = new StringCalculator();
	
	@Test
	public void returnZeroGivenEmptyString() {
		
		int expected = 0;
		int actual;
		
		actual = stringCalculator.add("");
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"1","2","3"})
	public void returnNumberGivenAsString(String input) {
				
		assertEquals(Integer.valueOf(input), stringCalculator.add(input));
		
	}
	
	@ParameterizedTest
	@CsvSource(value = {"1,2:3","3,3:6"}, delimiter = ':')
	public void returnSumGivenTwoNumbersAsString(String input, String expected) {
		
		assertEquals(Integer.valueOf(expected), stringCalculator.add(input));
		
	}

}
