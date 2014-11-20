/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class BigHeights {
	public int bigHeights(int[] heights, int start, int end) {
		int count = 0;

		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
				count++;
			}
		}

		return count;
	}
}
