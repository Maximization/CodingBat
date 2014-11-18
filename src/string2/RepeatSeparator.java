/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		String result = "";
		int i = 0;

		while (i < count) {
			result = result + word;
			i++;
			
			if (i == count) {
				break;
			}
			
			result = result + sep;
		}

		return result;
	}
}
