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
	
	@Test
	public void retuTest(){
		assertEquals(0,calculate.retu());
	}
	
		
	@Test
	public void retString(){
		assertEquals("1",calculate.retuString());
	}
	
	@Test
	public void setTest(){
		calculate.setString("hi");
		assertEquals("hi",calculate.retuString());
		
	}
	
	@Test
	public void testInt(){
		assertEquals(0,calculate.getInt());
	}
	
}
