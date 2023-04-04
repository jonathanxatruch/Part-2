package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideNegativeTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(25, 5);
		assertEquals(4, output);
	}

}
