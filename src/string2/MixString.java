/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class MixString {
	public String mixString(String a, String b) {
		String result = "";

		if (a.length() >= b.length()) {
			for (int i = 0; i < a.length(); i++) {
				result = result + a.charAt(i);
				
				if (i < b.length()) {
					result = result + b.charAt(i);
				}
			}
		} else {
			for (int i = 0; i < b.length(); i++) {
				if (i < a.length()) {
					result = result + a.charAt(i);
				}
				
				result = result + b.charAt(i);
			}
		}
		
		return result;
	}
}
