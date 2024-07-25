import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Numbertestdemo {
	@Test
	
	void factorialtest() {
		int exp=120;
		int act=Numberfunction.getFactorial(5);
		assertEquals(exp,act);
	}

}
