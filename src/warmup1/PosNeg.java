/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		return (negative && a < 0 && b < 0 || !negative && a < 0 && b >= 0 || !negative
				&& a >= 0 && b < 0);
	}

}
