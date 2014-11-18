/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class PairStar {
	public String pairStar(String str) {
		if (str.length() <= 1) {
			return str;
		} else if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		}

		return str.charAt(0) + pairStar(str.substring(1));
	}
}
