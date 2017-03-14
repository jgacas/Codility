package io.github.jgacas.codility.lesson4;

/**
 * Check whether array A is a permutation.
 *
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * For example, array A = {4, 1, 3, 2} is permutation and array A = {4, 1, 3} is not
 *
 * Expected worst-case time complexity is O(N);
 * Expected worst-case space complexity is O(N), beyond input storage
 *
 * @author jgacas
 */
public class PermCheck {
    /**
     * Solution to the permutation check problem.
     * @param A A non-empty zero-indexed array A consisting of N integer
     * @return Return 1 if array is permutation, otherwise return 0
     */
    public int solution(int[] A) {
        int n = A.length;
        int[] count = new int[n];

        // Count how many times certain values appear in array.
        for(int i = 0; i < n; i++) {
            if (A[i] < 1 || A[i] > n) {
                return 0;
            }
            count[A[i]-1] += 1;
        }

        // Check if every value in the array appears only once.
        for(int i = 0; i < n; i++) {
            if (count[i] != 1) {
                return 0;
            }
        }

        return 1;
    }
}
