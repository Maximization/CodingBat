/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class Right2 {
	public String right2(String str) {
		String last;

		if (str.length() >= 2) {
			last = str.substring(str.length() - 2, str.length());
		} else {
			last = str;
		}
		
		return last + str.substring(0, str.length() - 2);
	}
}
