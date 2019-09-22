package VijayPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Addtest {

	@Test
	void Addingtest() {
		MyClass junit = new MyClass();
		int result = junit.add(100,200);
		assertEquals(300, result);
	}

}
