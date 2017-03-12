package io.github.jgacas.codility.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the solution of flog jump problem.
 * 
 * @author jgacas
 *
 */
public class FrogJumpTest {

    @Test
    public void test() {
        FrogJump frogJumps = new FrogJump();
        
        int X = 10; // start position
        int Y = 85; // finish position
        int D = 30; // jump size
        
        assertEquals(3, frogJumps.solution(X, Y, D));
    }

}
