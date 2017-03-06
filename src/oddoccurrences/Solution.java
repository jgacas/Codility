package oddoccurrences;

/**
 * Find value that occurs in odd number of elements.
 * 
 * The array contains an odd number of elements, 
 * and each element of the array can be paired with another element 
 * that has the same value, except for one element that is left unpaired.
 * 
 * In array [9, 3, 9, 3, 9, 7, 9] number 7 is odd occurrence.
 * 
 * Expected worst-case time complexity is O(N);
 * Expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments)
 * 
 * Note: paired values are always found in indexes A[i] and A[i+2]
 * 
 * @author jgacas
 *
 */
public class Solution {
    /**
     * Solution to finding odd occurrence of array value.
     * @param A array of integers
     * @param N array size
     * @return
     */
    public int solution(int A[], int N) {
        int i;
        for (i = 0; i < N; i++) {
            // Element already has a pair because
            // we mark paired elements with -1
            if (A[i] == -1) {
                continue;
            }

            // We reached one of two last elements in a array,
            // so it is certain that current element doesn't have a pair,
            // we found odd element
            if (i + 2 >= N) {
                break;
            }

            // Pair elements are not equal, we found odd element
            if (A[i] != A[i + 2]) {
                break;
            }

            // Mark paired elements
            A[i] = A[i + 2] = -1;

        }
        return A[i];
    }
}
