import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

	@Test
	void testIs1Prime() {
	int result = PrimeNumber.getNthPrime(1);
	
	assertEquals(2, result);
	
	}

	@Test
	void testIs2Prime() {
	int result = PrimeNumber.getNthPrime(2);
	
	assertEquals(3, result);
	
	}
	
	@Test
	void testIs3Prime() {
	int result = PrimeNumber.getNthPrime(3);
	
	assertEquals(5, result);
	
	}
	
	@Test
	void testIs4Prime() {
	int result = PrimeNumber.getNthPrime(4);
	
	assertEquals(7, result);
	
	}
	
	@Test
	void testIs5Prime() {
	int result = PrimeNumber.getNthPrime(5);
	
	assertEquals(11, result);
	
	}
	
	
	
}

