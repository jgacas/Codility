package io.github.jgacas.codility.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the solution of cyclic rotation problem.
 * 
 * @author jgacas
 *
 */
public class CyclicRotationTest {

    @Test
    public void testSolutionWhenRotatedThreeTimes() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        
        int[] expected = {9, 7, 6, 3, 8};
        assertArrayEquals(expected, cyclicRotation.solution(A, K));
    }
    
    @Test
    public void testSolutionWhenRotatedTenTimes() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        
        int[] A = {3, 8, 9, 7, 6};
        int K = 10;
        
        int[] expected = {3, 8, 9, 7, 6};
        assertArrayEquals(expected, cyclicRotation.solution(A, K));
    }

}
