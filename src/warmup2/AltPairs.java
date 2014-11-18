/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class AltPairs {
	public String altPairs(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res += str.charAt(i);

			if (res.length() % 2 == 0) {
				i += 2;
			}
		}

		return res;
	}
}
