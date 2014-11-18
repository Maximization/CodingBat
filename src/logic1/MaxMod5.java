/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class MaxMod5 {
	public int maxMod5(int a, int b) {
		if (a == b) {
			return 0;
		}

		if (a % 5 == b % 5) {
			if (a > b) {
				return b;
			} else {
				return a;
			}
		}

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
