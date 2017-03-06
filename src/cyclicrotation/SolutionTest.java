package cyclicrotation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the solution of cyclic rotation problem.
 * 
 * @author jgacas
 *
 */
public class SolutionTest {

    @Test
    public void testSolutionWhenRotatedThreeTimes() {
        Solution cyclicRotation = new Solution();
        
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        
        int[] expected = {9, 7, 6, 3, 8};
        assertArrayEquals(expected, cyclicRotation.solution(A, K));
    }
    
    @Test
    public void testSolutionWhenRotatedTenTimes() {
        Solution cyclicRotation = new Solution();
        
        int[] A = {3, 8, 9, 7, 6};
        int K = 10;
        
        int[] expected = {3, 8, 9, 7, 6};
        assertArrayEquals(expected, cyclicRotation.solution(A, K));
    }

}
