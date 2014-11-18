/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class SameStarChar {
	public boolean sameStarChar(String str) {
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}
}
