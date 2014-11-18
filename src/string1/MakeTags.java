/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class MakeTags {
	public String makeTags(String tag, String word) {
		String open = "<" + tag + ">";
		String close = "</" + tag + ">";

		return open + word + close;
	}
}
