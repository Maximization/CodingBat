/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class MinCat {
	public String minCat(String a, String b) {
		if (a.length() > b.length()) {
			return a.substring(a.length() - b.length()) + b;
		} else if (a.length() < b.length()) {
			return a + b.substring(b.length() - a.length());
		}

		return a + b;
	}
}
