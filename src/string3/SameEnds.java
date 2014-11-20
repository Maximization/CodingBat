/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class SameEnds {
	public String sameEnds(String string) {
		String result = "";

		for (int i = 0; i <= string.length() / 2; i++) {
			String begin = string.substring(0, i);
			String end = string.substring(string.length() - i);

			if (begin.equals(end)) {
				result = begin;
			}
		}

		return result;
	}
}
