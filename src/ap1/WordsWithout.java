/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class WordsWithout {
	public String[] wordsWithout(String[] words, String target) {
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				count++;
			}
		}

		int len = words.length - count;
		String[] str = new String[len];
		int index = 0;

		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				str[index] = words[i];
				index++;
			}
		}

		return str;
	}
}
