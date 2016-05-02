package hansung;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calc_pro {

	@Test
	public void test() {
		Calc c = new Calc();
		int e = c.add(2,3);
		assertEquals(e, 5);
		
	}

}
