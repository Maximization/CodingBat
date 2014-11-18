/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class WithouEnd2 {
	public String withouEnd2(String str) {
		if (str.length() > 2) {
			return str.substring(1, str.length() - 1);
		}
		
		return "";
	}
}
