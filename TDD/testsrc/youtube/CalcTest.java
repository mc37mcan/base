package youtube;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private Calc calculate;
	
	@Before
	public void setUp() throws Exception {
		calculate = new Calc();
	}

	@Test
	public void testSubtract() {
		long sub = 5 - 3 - 2;
		assertEquals(sub,calculate.subtract(5,3,2));
		
		sub = 0;
		assertEquals(sub , calculate.subtract(5,5));
	}

	@Test
	public void testAdd() {
		long sum =  3 + 5 + 3;
		assertEquals(sum,calculate.add(3,5,3));
	}

}
