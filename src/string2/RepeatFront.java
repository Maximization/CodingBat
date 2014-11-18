/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class RepeatFront {
	public String repeatFront(String str, int n) {
		String result = "";

		for (int i = n; i > 0; i--) {
			result = result + str.substring(0, i);
		}

		return result;
	}
}
