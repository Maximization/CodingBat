/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array3;

public class SeriesUp {
	public int[] seriesUp(int n) {
		int[] array = new int[n * (n + 1) / 2];
		int index = 0;
		int pattern = 1;

		while (index < array.length) {
			for (int i = 1; i <= pattern; i++) {
				array[index] = i;
				index++;
			}

			pattern++;
		}

		return array;
	}
}
