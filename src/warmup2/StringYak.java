/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class StringYak {
	public String stringYak(String str) {
		String res = "";

		if (str.length() < 3) {
			return str;
		}

		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 2 && str.charAt(i) == 'y'
					&& str.charAt(i + 2) == 'k') {
				i += 2;
			} else {
				res += str.charAt(i);
			}
		}

		return res;
	}
}
