/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class LastChars {
	public String lastChars(String a, String b) {
		String first = "";
		String last = "";

		if (a.length() == 0) {
			first = "@";
		} else {
			first = a.substring(0, 1);
		}

		if (b.length() == 0) {
			last = "@";
		} else {
			last = b.substring(b.length() - 1);
		}

		return first + last;
	}
}
