/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class SumDigits {
	public int sumDigits(int n) {
		if (n == 0) {
			return 0;
		}

		return n % 10 + sumDigits(n / 10);
	}
}