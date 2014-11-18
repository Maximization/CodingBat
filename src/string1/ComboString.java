/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class ComboString {
	public String comboString(String a, String b) {
		String l = "";
		String s = "";

		if (a.length() > b.length()) {
			l = a;
			s = b;
		} else {
			l = b;
			s = a;
		}

		return s + l + s;
	}
}
