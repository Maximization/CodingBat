/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class SumHeights {
	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;

		for (int i = start; i < end; i++) {
			sum += Math.abs(heights[i] - heights[i + 1]);
		}

		return sum;
	}
}
