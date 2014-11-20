/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
	public List<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				al.add(words[i]);
			}
		}

		return al;
	}
}
