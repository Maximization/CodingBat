/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		int count = 0;

		for (int i = 0; i < str.length() - (n - 1); i++) {
			if (str.substring(i, i + n).equals(prefix)) {
				count++;
			}
		}

		return (count >= 2);
	}
}
