/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class FrontAgain {
	public boolean frontAgain(String str) {
		if (str.length() >= 2) {
			String first = str.substring(0, 2);
			String last = str.substring(str.length() - 2);

			return (first.equals(last));
		}

		return false;
	}
}
