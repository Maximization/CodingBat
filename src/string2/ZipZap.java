/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class ZipZap {
	public String zipZap(String str) {
		String result = "";

		if (str.length() <= 2) {
			return str;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				result = result + str.charAt(i) + str.charAt(i + 2);
				i = i + 2;
			} else {
				result = result + str.charAt(i);
			}
		}

		return result;
	}
}
