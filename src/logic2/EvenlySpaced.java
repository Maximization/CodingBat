/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic2;

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		if (a == b && b == c) {
			return true;
		}

		if (a == b || b == c || a == b) {
			return false;
		}

		int ab = Math.abs(a - b);
		int bc = Math.abs(b - c);
		int ac = Math.abs(a - c);

		return (ab == bc || bc == ac || ab == ac);
	}
}
