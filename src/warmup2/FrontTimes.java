/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class FrontTimes {
	public String frontTimes(String str, int n) {
		String res = "";

		for (int i = 0; i < n; i++) {
			if (str.length() < 3) {
				res += str;
			} else {
				res += str.substring(0, 3);
			}
		}

		return res;
	}
}
