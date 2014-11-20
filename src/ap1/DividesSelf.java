/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class DividesSelf {
	public boolean dividesSelf(int n) {
		int tempN = n;

		while (tempN != 0) {
			int digit = tempN % 10;

			if (digit == 0 || n % digit != 0) {
				return false;
			}

			tempN /= 10;
		}

		return true;
	}
}
