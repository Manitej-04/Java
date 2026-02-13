package com.cateen.CICDExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalTest {
	
	@Test
	void addTest() {
		SimpleCal s = new SimpleCal();
		int res = s.add(10, 10);
		
		assertEquals(20, res);
	}
	
	@Test
	void mulTest() {
		SimpleCal s = new SimpleCal();
		assertEquals(25, s.mul(5, 5));
	}
}
