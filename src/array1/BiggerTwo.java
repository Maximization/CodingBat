/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class BiggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		int asum = a[0] + a[1];
		int bsum = b[0] + b[1];

		if (bsum <= asum) {
			return a;
		}

		return b;
	}
}
