/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class DoubleX {
	boolean doubleX(String str) {
		int index = str.indexOf("x");

		if (index == str.length() - 1 || index == -1) {
			return false;
		}

		return (str.charAt(index + 1) == 'x');
	}
}
