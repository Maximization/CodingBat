/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class NotString {
	public String notString(String str) {
		if (str.equals("not") || str.equals("not bad")) {
			return str;
		}
		
		return "not " + str;
	}
}
