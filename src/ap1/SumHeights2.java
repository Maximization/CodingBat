/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class SumHeights2 {
	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;

		for (int i = start; i < end; i++) {
			if (heights[i] < heights[i + 1]) {
				sum += (heights[i + 1] - heights[i]) * 2;
			} else {
				sum += heights[i] - heights[i + 1];
			}
		}

		return sum;
	}
}
