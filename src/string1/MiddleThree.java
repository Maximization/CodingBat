/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class MiddleThree {
	public String middleThree(String str) {
		int mid = (str.length() - 1) / 2;

		return str.substring(mid - 1, mid + 2);
	}
}
