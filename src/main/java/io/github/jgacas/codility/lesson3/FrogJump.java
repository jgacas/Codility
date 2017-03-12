package io.github.jgacas.codility.lesson3;

/**
 * Frog jumps problem.
 * 
 * Count minimal number of jumps from position X to Y if fixed jump distance is D.
 * For a given X = 30, Y = 85 and D = 30 the function should return  3.
 * 
 * Expected worst-case time complexity is O(1)
 * Expected worst-case time complexity is O(1)
 * 
 * @author jgacas
 *
 */
public class FrogJump {
    /**
     * OddOccurrencesInArray to the minimal number of jumps between two positions problem.
     * @param X Start position
     * @param Y Finish position
     * @param D Fixed jump distance
     * @return minimal number of jumps
     */
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
