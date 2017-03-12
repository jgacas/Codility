package io.github.jgacas.codility.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the OddOccurrencesInArray of odd occurrences in array problem.
 * 
 * @author jgacas
 *
 */
public class OddOccurrencesInArrayTest {

    @Test
    public void testSolutionWhenFirstElementIsOddOccurrence() {
        OddOccurrencesInArray oddOccurrences = new OddOccurrencesInArray();

        int input[] = { 3, 9, 5, 9, 5 };
        assertEquals(3, oddOccurrences.solution(input, input.length));
    }

    @Test
    public void testSolutionWhenSecondElementIsOddOccurrence() {
        OddOccurrencesInArray oddOccurrences = new OddOccurrencesInArray();

        int input[] = { 9, 3, 9 };
        assertEquals(3, oddOccurrences.solution(input, input.length));
    }

    @Test
    public void testSolutionWhenElementBeforeLastOneIsOddOccurrence() {
        OddOccurrencesInArray oddOccurrences = new OddOccurrencesInArray();

        int input[] = { 9, 3, 9, 3, 9, 7, 9 };
        assertEquals(7, oddOccurrences.solution(input, input.length));

    }

    @Test
    public void testSolutionWhenLastElementIsOddOccurrence() {
        OddOccurrencesInArray oddOccurrences = new OddOccurrencesInArray();

        int input[] = { 9, 3, 9, 3, 5 };
        assertEquals(5, oddOccurrences.solution(input, input.length));
    }
}
