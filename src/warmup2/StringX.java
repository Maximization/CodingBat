/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class StringX {
	public String stringX(String str) {
		String res = "";

		if (str.length() <= 2) {
			return str;
		}

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != 'x') {
				res += str.charAt(i);
			}
		}

		return str.charAt(0) + res + str.charAt(str.length() - 1);
	}
}
