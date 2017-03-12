package io.github.jgacas.codility.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibriumTest {

    @Test
    public void test() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        
        int[] A = {3, 1, 2, 4, 3};
        
        assertEquals(1, tapeEquilibrium.solution(A));
    }

}
