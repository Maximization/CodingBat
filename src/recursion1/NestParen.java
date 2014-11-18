/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class NestParen {
	public boolean nestParen(String str) {
		if (str.length() == 0) {
			return true;
		} else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return nestParen(str.substring(1, str.length() - 1));
		}

		return false;
	}
}
