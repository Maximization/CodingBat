/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class EndsLy {
	public boolean endsLy(String str) {
		if (str.length() >= 2 && str.substring(str.length() - 2).equals("ly")) {
			return true;
		}

		return false;
	}
}
