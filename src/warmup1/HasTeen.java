/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class HasTeen {
	public boolean hasTeen(int a, int b, int c) {
		if (a <= 19 && a >= 13) {
			return true;
		} else if (b <= 19 && b >= 13) {
			return true;
		} else if (c <= 19 && c >= 13) {
			return true;
		}
		
		return false;
	}
}
