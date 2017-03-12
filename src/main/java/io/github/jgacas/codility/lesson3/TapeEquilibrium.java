package io.github.jgacas.codility.lesson3;

/**
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 * 
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts:
 * A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * The difference between the two parts is the value of: 
 * |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * 
 * Expected worst-case time complexity is O(N).
 * Expected worst-case space complexity is O(N), beyond input storage.
 * 
 * @author jgacas
 *
 */
public class TapeEquilibrium {
    /**
     * OddOccurrencesInArray to tape equilibrium problem.
     * @param A Zero-indexed array A consisting of N integers.
     * @return Minimum difference if split parts.
     */
    public int solution(int[] A) {
        int n = A.length;
        // Left sums - we are adding elements on left side of the array, for example 
        // value of element with index i will be sum of all elements from index 0 to index i
        int[] leftSums = new int[n];
        
        // Find total sum of numbers in the array.
        // Also find left sums we will use to calculate difference between split parts.
        leftSums[0] = A[0];
        for(int i = 1; i < n; i++) {
            leftSums[i] = leftSums[i-1] + A[i];
        }
        
        // Calculate difference for all splits and which one has minimum value.
        int totalSum = leftSums[n-1];                               // total sum is stored in the last leftSum index
        int min = Math.abs(leftSums[0] - (totalSum - leftSums[0])); // initial min diff value
        for(int i = 1; i < n - 1; i++) {
            int diff = Math.abs(leftSums[i] - (totalSum - leftSums[i]));
            if (diff < min) {
                min = diff;
            }
        }
        
        return min;
    }

}
