/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class StrDist {
	public int strDist(String str, String sub) {
		if (str.length() < sub.length()) {
			return 0;
		} else if (!str.substring(0, sub.length()).equals(sub)) {
			return strDist(str.substring(1), sub);
		} else if (!str.substring(str.length() - sub.length()).equals(sub)) {
			return strDist(str.substring(0, str.length() - 1), sub);
		}

		return str.length();
	}
}
