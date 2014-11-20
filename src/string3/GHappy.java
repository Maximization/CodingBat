/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class GHappy {
	public boolean gHappy(String str) {
		if (str.length() == 1) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i == 0) {
					if (str.charAt(i + 1) != 'g') {
						return false;
					} else {
						continue;
					}
				}

				if (i == str.length() - 1) {
					if (str.charAt(i - 1) != 'g') {
						return false;
					} else {
						continue;
					}
				}

				if (str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g') {
					return false;
				}
			}
		}

		return true;
	}
}
