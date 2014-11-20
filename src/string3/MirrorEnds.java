/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class MirrorEnds {
	public String mirrorEnds(String string) {
		String result = "";
		String end = "";

		for (int i = 0; i < string.length(); i++) {
			String begin = string.substring(0, i + 1);
			end += string.charAt(string.length() - 1 - i);

			if (begin.equals(end)) {
				result = begin;
			}
		}

		return result;
	}
}
