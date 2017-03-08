package permmissingelem;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test the solution for finding missing element in permutation. 
 * 
 * @author jgacas
 *
 */
public class SolutionTest {

    @Test
    public void test() {
        Solution permutationMissingElemenet = new Solution();
        
        int[] A = {2,3,1,5};
        
        assertEquals(4, permutationMissingElemenet.solution(A));
    }

}
