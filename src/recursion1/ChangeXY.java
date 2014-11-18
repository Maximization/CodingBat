/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class ChangeXY {
	public String changeXY(String str) {
		if (str.length() == 0) {
			return str;
		}

		String res = "";

		if (str.charAt(0) == 'x') {
			res += "y";
		} else {
			res += str.charAt(0);
		}

		return res + changeXY(str.substring(1));
	}
}
