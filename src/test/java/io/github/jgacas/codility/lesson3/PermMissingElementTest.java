package io.github.jgacas.codility.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test the solution for finding missing element in permutation. 
 * 
 * @author jgacas
 *
 */
public class PermMissingElementTest {

    @Test
    public void test() {
        PermMissingElement permutationMissingElemenet = new PermMissingElement();
        
        int[] A = {2,3,1,5};
        
        assertEquals(4, permutationMissingElemenet.solution(A));
    }

}
