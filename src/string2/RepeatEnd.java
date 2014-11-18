/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		String result = "";

		for (int i = 1; i <= n; i++) {
			result = result + str.substring(str.length() - n);
		}

		return result;
	}
}
