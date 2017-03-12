package io.github.jgacas.codility.lesson2;

/**
 * Rotate an array to the right by a given number of steps.
 * 
 * A zero-indexed array A consisting of N integers is given. 
 * Rotation of the array means that each element is shifted right by one index, 
 * and the last element of the array is also moved to the first place.
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
 * 
 * N and K are integers within the range [0..100].
 * Each element of array A is an integer within the range [−1,000..1,000].
 * 
 * @author jgacas
 */
public class CyclicRotation {
    /**
     * OddOccurrencesInArray to the array rotation.
     * @param A array of integers
     * @param K number of rotating steps
     * @return rotated array
     */
    public int[] solution(int[] A, int K) {
        int n = A.length;
        
        // Make a copy of input array.
        int[] original = new int[n];
        for(int i = 0; i < n; i++) {
            original[i] = A[i];
        }
        
        // Rotate input array by calculating index after rotation.
        for(int i = 0; i < n; i++) {
            A[(i + K) % n] = original[i];
        }
        
        return A;
    }
}
