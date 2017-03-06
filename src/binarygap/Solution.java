package binarygap;

/**
 * Find longest sequence of zeros in binary representation of an integer.
 * 
 * Number 9 has binary representation 1001 and contains a binary gap of length 2. 
 * The number 529 has binary representation 1000010001 and contains two binary gaps: 
 * one of length 4 and one of length 3. 
 * The number 20 has binary representation 10100 and contains one binary gap of length 1.
 * 
 * Expected worst-case time complexity is O(log(N));
 * Expected worst-case space complexity is O(1).
 * 
 * @author jgacas
 *
 */
public class Solution {
    /**
     * Solution to finding longest sequence of zeros in binary representation of an integer.
     * @param N integer number
     * @return longest sequence of zeros in binary representation.
     */
    public int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;

        // Every even integer's binary representation ends with zero.
        // This will remove all zeros from the end of binary word.
        while (N % 2 == 0) {
            N /= 2;
        }

        // Use fact that Every even integer's binary representation ends with
        // zero to count zero gap.
        // Shift binary word (by dividing by 2) to the right and count number of
        // zeros between ones.
        while (N > 0) {
            if (N % 2 == 0) {
                currentGap++;
            } else {
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
            N /= 2;
        }

        return maxGap;
    }
}
