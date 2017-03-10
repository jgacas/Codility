package tapeequilibrium;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        Solution tapeEquilibrium = new Solution();
        
        int[] A = {3, 1, 2, 4, 3};
        
        assertEquals(1, tapeEquilibrium.solution(A));
    }

}
