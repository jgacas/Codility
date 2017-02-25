package binarygap;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		Solution binaryGap = new Solution();
		
		assertEquals(2, binaryGap.solution(9));
		assertEquals(4, binaryGap.solution(529));
		assertEquals(1, binaryGap.solution(20));
	}

}
