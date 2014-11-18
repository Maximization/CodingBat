/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class StarOut {
	public String starOut(String str) {
		String res = "";
		int found = str.indexOf("*");

		if (found == -1) {
			return str;
		}

		for (int i = 0; i < str.length(); i++) {
			if (i == found + 1) {
				found = str.indexOf("*", found + 1);
			} else if (i != found - 1 && i != found) {
				res += str.charAt(i);
			}
		}

		return res;
	}
}
