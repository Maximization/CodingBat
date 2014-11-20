/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class HasOne {
	public boolean hasOne(int n) {
		while (n != 0) {
			if (n % 10 == 1) {
				return true;
			}

			n /= 10;
		}

		return false;
	}
}
