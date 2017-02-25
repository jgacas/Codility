package binarygap;

public class Solution {
	public int solution(int N) {
		int maxGap = 0;
		int currentGap = 0;
		
		// Every even integer's binary representation ends with zero.
		// This will remove all zeros from the end of binary word.
		while(N % 2 == 0) {
			N /= 2;
		}
		
		// Use fact that Every even integer's binary representation ends with zero to count zero gap.
		// Shift binary word (by dividing by 2) to the right and count number of zeros between ones.
		while(N > 0) {
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
