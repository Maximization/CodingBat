/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class AllStar {
	public String allStar(String str) {
		if (str.length() <= 1) {
			return str;
		}

		return str.charAt(0) + "*" + allStar(str.substring(1));
	}
}
