package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import calculator.calculator1;

public class JunitTest {

	@Test
	public void testadd()   {
		assertEquals(15,calculator1.add(10,5),0);
	}
	
	@Test
	public void testsub() {
		assertEquals(5,calculator1.sub(10,5),0);
	}
	
	@Test
	public void testmul() {
		assertEquals(50,calculator1.mul(10,5),0);
	}
	
	@Test
	public void testdiv() {
		assertEquals(2,calculator1.divInt(10,5),0);
	}
	
}
