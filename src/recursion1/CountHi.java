/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class CountHi {
	public int countHi(String str) {
		if (str.length() < 2) {
			return 0;
		} else if (str.substring(0, 2).equals("hi")) {
			return 1 + countHi(str.substring(1));
		}

		return countHi(str.substring(1));
	}
}
