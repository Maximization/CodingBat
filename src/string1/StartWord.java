/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class StartWord {
	public String startWord(String str, String word) {
		if (str.length() == 0) {
			return "";
		}

		if (str.length() == 1 && word.length() == 2) {
			return "";
		}

		String front = str.substring(1, word.length());
		String word1 = word.substring(1);

		if (front.equals(word1)) {
			return str.substring(0, 1) + word.substring(1);
		}

		return "";
	}
}
