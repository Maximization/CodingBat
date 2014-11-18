/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class MiddleTwo {
	public String middleTwo(String str) {
		return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
	}
}
