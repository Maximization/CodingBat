/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class LastTwo {
	public String lastTwo(String str) {
		if (str.length() >= 2) {
			String first = str.substring(0, str.length() - 2);
			String middle = str.substring(str.length() - 2, str.length() - 1);
			String last = str.substring(str.length() - 1);
			
			return first + last + middle;
		}

		return str;
	}
}
