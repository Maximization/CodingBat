/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class WordEnds {
	public String wordEnds(String str, String word) {
		String res = "";
		int found = str.indexOf(word);

		if (str.length() <= 2) {
			return res;
		}

		while (found != -1) {
			if (found == 0) {
				res += str.charAt(word.length());
			} else if (found == str.length() - word.length()) {
				res += str.charAt(found - 1);
			} else {
				res += str.charAt(found - 1);
				res += str.charAt(found + word.length());
			}

			found = str.indexOf(word, found + 1);
		}

		return res;
	}
}
