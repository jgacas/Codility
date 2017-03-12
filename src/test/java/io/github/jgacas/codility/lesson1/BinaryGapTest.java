package io.github.jgacas.codility.lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the solution of binary gap problem.
 *
 * @author jgacas
 */
public class BinaryGapTest {
    @Test
    public void testSolution() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(1, binaryGap.solution(20));
    }

}
