/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class FrontBack {
	public String frontBack(String str) {
		if (str.length() < 2) {
			return str;
		}
		
		String first = str.substring(0, 1);
		String last = str.substring(str.length() - 1, str.length());
		
		return last + str.substring(1, str.length() - 1) + first;
	}
}
