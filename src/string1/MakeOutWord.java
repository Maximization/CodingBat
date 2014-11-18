/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class MakeOutWord {
	public String makeOutWord(String out, String word) {
		String open = out.substring(0, 2);
		String close = out.substring(2);

		return open + word + close;
	}
}
