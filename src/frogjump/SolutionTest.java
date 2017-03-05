package frogjump;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        Solution frogJumps = new Solution();
        
        int X = 10; // start position
        int Y = 85; // finish position
        int D = 30; // jump size
        
        assertEquals(3, frogJumps.solution(X, Y, D));
    }

}
