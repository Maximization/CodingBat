/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class Count7 {
	public int count7(int n) {
		if (n == 0) {
			return 0;
		} else if (n % 10 == 7) {
			return 1 + count7(n / 10);
		}

		return count7(n / 10);
	}
}
