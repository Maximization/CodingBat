/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array3;

public class SquareUp {
	public int[] squareUp(int n) {
		int[] array = new int[n * n];
		int[] pattern = new int[n];
		if (n != 0) {
			pattern[n - 1] = 1;
		}

		for (int i = 0; i < array.length; i += n) {
			for (int j = 0; j < n; j++) {
				array[i + j] = pattern[j];
			}

			for (int j = n - 1; j >= 0; j--) {

				if (pattern[j] == 0) {
					pattern[j] = pattern[j + 1] + 1;
					break;
				}
			}
		}

		return array;
	}
}
