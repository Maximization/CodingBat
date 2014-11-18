/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class Diff21 {
	public int diff21(int n) {
		int diff21 = 21 - n;
		
		if (n > 21) {
			diff21 = -diff21 * 2;
		}
		
		return diff21;
	}
}
