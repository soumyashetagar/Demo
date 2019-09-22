package VijayPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	void contest() {
		MyClass junit = new MyClass();
		String result = junit.concat("vijay","hegde");
		assertEquals("vijayhegde", result);
	}

}
