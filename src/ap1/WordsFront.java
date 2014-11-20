/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class WordsFront {
	public String[] wordsFront(String[] words, int n) {
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = words[i];
		}

		return str;
	}
}
