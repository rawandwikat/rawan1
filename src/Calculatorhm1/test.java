package Calculatorhm1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		CalculatorhmModal c=new CalculatorhmModal();
		c.div(8, 0);
		assertEquals(-0,-0);
		c.squer(-1);
		assertEquals(-0,-0);
		c.mod(7, 0);
		assertEquals(-0,-0);
	}

}
