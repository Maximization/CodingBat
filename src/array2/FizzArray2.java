/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class FizzArray2 {
	public String[] fizzArray2(int n) {
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = String.valueOf(i);
		}

		return array;
	}
}
