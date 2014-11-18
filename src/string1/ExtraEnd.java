/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class ExtraEnd {
	public String extraEnd(String str) {
		String last = str.substring(str.length() - 2);

		return last + last + last;
	}
}
