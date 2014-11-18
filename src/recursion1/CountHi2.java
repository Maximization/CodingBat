/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class CountHi2 {
	public int countHi2(String str) {
		if (str.length() <= 2) {
			if (str.equals("hi")) {
				return 1;
			} else {
				return 0;
			}
		} else if (str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
			return countHi2(str.substring(3));
		} else if (str.substring(0, 2).equals("hi")) {
			return 1 + countHi2(str.substring(2));
		}

		return countHi2(str.substring(1));
	}
}
