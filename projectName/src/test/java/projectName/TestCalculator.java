package projectName;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	Calculator cal = new Calculator();
	int result;
	@Test
	public void add() {
		result = cal.addition(2, 4);
		assertEquals(result,6);
	}
}
