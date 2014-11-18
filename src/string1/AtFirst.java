/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class AtFirst {
	public String atFirst(String str) {
		if (str.length() >= 2) {
			return str.substring(0, 2);
		} else if (str.length() == 0) {
			return "@@";
		}

		return str + "@";
	}
}
