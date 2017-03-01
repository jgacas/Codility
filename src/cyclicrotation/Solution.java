package cyclicrotation;

/**
 * Rotate an array to the right by a given number of steps.
 * 
 * @author jgacas
 */
public class Solution {
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
