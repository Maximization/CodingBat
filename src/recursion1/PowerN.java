/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class PowerN {
	public int powerN(int base, int n) {
		if (n == 0) {
			return 1;
		}

		return base * powerN(base, n - 1);
	}
}
