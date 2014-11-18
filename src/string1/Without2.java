/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class Without2 {
	public String without2(String str) {
		if (str.length() < 2) {
			return str;
		}

		String first = str.substring(0, 2);
		String last = str.substring(str.length() - 2);

		if (first.equals(last)) {
			return str.substring(2);
		}

		return str;
	}
}
