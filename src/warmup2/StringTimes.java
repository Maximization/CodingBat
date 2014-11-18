/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class StringTimes {
	public String stringTimes(String str, int n) {
		String res = "";

		for (int i = 0; i < n; i++) {
			res += str;
		}

		return res;
	}
}
