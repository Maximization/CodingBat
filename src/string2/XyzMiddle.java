/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		if (str.length() < 3) {
			return false;
		}

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("xyz") && Math.abs(i - (str.length() - (i + 3))) <= 1) {
				return true;
			}
		}

		return false;
	}
}
