/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class Make2 {
	public int[] make2(int[] a, int[] b) {
		int[] res = new int[2];

		if (a.length >= 2) {
			res[0] = a[0];
			res[1] = a[1];
		} else if (a.length == 1) {
			res[0] = a[0];
			res[1] = b[0];
		} else if (a.length == 0) {
			res[0] = b[0];
			res[1] = b[1];
		}

		return res;
	}
}