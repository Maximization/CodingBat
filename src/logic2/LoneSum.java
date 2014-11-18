/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class LoneSum {
	public int loneSum(int a, int b, int c) {
		if (a == b && a == c) {
			return 0;
		}

		if (a == b) {
			return c;
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		}

		return a + b + c;
	}
}
