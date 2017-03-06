package oddoccurrences;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the solution of odd occurrences in array problem.
 * 
 * @author jgacas
 *
 */
public class SolutionTest {

    @Test
    public void testSolutionWhenFirstElementIsOddOccurrence() {
        Solution oddOccurrences = new Solution();

        int input[] = { 3, 9, 5, 9, 5 };
        assertEquals(3, oddOccurrences.solution(input, input.length));
    }

    @Test
    public void testSolutionWhenSecondElementIsOddOccurrence() {
        Solution oddOccurrences = new Solution();

        int input[] = { 9, 3, 9 };
        assertEquals(3, oddOccurrences.solution(input, input.length));
    }

    @Test
    public void testSolutionWhenElementBeforeLastOneIsOddOccurrence() {
        Solution oddOccurrences = new Solution();

        int input[] = { 9, 3, 9, 3, 9, 7, 9 };
        assertEquals(7, oddOccurrences.solution(input, input.length));

    }

    @Test
    public void testSoultionWhenLastElementIsOddOccurrence() {
        Solution oddOccurrences = new Solution();

        int input[] = { 9, 3, 9, 3, 5 };
        assertEquals(5, oddOccurrences.solution(input, input.length));
    }
}
