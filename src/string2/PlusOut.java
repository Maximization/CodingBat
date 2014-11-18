/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class PlusOut {
	public String plusOut(String str, String word) {
		String res = "";
		int found = str.indexOf(word);

		for (int i = 0; i < str.length(); i++) {
			if (i == found) {
				res += word;
				found = str.indexOf(word, found + word.length());
				i += word.length() - 1;
			} else {
				res += "+";
			}
		}

		return res;
	}
}
