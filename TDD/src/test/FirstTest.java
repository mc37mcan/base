package test;

import junit.framework.TestCase;

public class FirstTest extends TestCase {
	
	public void start(){
		PrintTest one = new PrintTest();
		assertNotNull(one);
	}

}
