/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class StringE {
	public boolean stringE(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}

		return (count <= 3 && count >= 1);
	}
}
