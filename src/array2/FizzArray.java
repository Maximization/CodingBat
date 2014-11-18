/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class FizzArray {
	public int[] fizzArray(int n) {
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = i;
		}

		return array;
	}
}
