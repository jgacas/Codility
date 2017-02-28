package oddoccurrences;

/**
 * Find value that occurs in odd number of elements.
 * @author juga
 *
 */
public class Solution {
	public int solution(int A[], int N) {
		int i;
		for(i = 0; i < N; i++) {
			// Element already has a pair because 
			// we mark paired elements with -1
			if (A[i] == -1) {
				continue;
			}
			
			// We reached one of two last elements in a array,
			// so it is certain that current element doesn't have a pair,
			// we found odd element
			if (i+2 >= N) {
				break;
			}
			
			// Pair elements are not equal, we found odd element
			if (A[i] != A[i+2]) {
				break;
			}
			
			// Mark paired elements
			A[i] = A[i+2] = -1;
			
		}
		return A[i];
	}
}
