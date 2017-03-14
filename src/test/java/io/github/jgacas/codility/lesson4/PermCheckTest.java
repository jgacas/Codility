package io.github.jgacas.codility.lesson4;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test solution fo permutation check problem.
 *
 * @author jgacas
 */
public class PermCheckTest {

    @Test
    public void testSolutionWithPermArray() {
        PermCheck permCheck = new PermCheck();

        int[] A = {4, 1, 3, 2};

        assertEquals(1, permCheck.solution(A));
    }

    @Test
    public void testSolutionWithNonPermArray() {
        PermCheck permCheck = new PermCheck();

        int[] A = {4, 1, 3};

        assertEquals(0, permCheck.solution(A));

        int[] B = {4, 1, 3, 1};
        assertEquals(0, permCheck.solution(B));
    }

    @Test
    public void testSolutionWithDuplicateValuesInArray() {
        PermCheck permCheck = new PermCheck();

        int[] A = {4, 1, 3, 1};
        assertEquals(0, permCheck.solution(A));
    }
}
