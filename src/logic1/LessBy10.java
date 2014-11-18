/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class LessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		boolean lessA = (a - b >= 10 || a - c >= 10);
		boolean lessB = (b - a >= 10 || b - c >= 10);
		boolean lessC = (c - b >= 10 || c - a >= 10);

		return (lessA || lessB || lessC);
	}
}
