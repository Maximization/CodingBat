/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class WordsCount {
	public int wordsCount(String[] words, int len) {
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				count++;
			}
		}

		return count;
	}
}
