/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class XyBalance {
	public boolean xyBalance(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				count++;
			} else if (str.charAt(i) == 'y') {
				count = 0;
			}
		}

		return (count == 0);
	}
}
