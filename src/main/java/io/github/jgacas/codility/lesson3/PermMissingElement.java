package io.github.jgacas.codility.lesson3;

/**
 * Find the missing element in a given permutation.
 * 
 * A zero-indexed array A consisting of N different integers is given. 
 * The array contains integers in the range [1..(N + 1)], 
 * which means that exactly one element is missing.
 * 
 * For example, given array A = {2,3,1,5} function should return 4,
 * as it is the missing element.
 * 
 * @author jgacas
 *
 */
public class PermMissingElement {
    /**
     * OddOccurrencesInArray to problem of finding missing element in a given permutation.
     * 
     * @param A A zero-indexed array A consisting of N different integers
     * @return Missing element in a given permutation
     */
    public int solution(int[] A) {
        int n = A.length;
        
        // Find a sum of integers in a given array.
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += A[i];
        }
        
        // To find missing element we will use the fact that sum of N integer numbers
        // is n*(n + 1)/2, and the difference between expected and actual sums is equal
        // to the missing element.
        int expectedSum = (n + 1) * ((n + 1) + 1) / 2;
        
        return expectedSum - sum;
    }
}
