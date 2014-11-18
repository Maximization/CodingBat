/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class ConCat {
	public String conCat(String a, String b) {
		String last = "";
		String first = "";

		if (a.length() >= 1) {
			last = a.substring(a.length() - 1);
		}

		if (b.length() >= 1) {
			first = b.substring(0, 1);
		}

		if (last.equals(first)) {
			return a + b.substring(1);
		}

		return a + b;
	}
}
