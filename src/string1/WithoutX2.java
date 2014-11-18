/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class WithoutX2 {
	public String withoutX2(String str) {
		if (str.length() > 0 && str.charAt(0) == 'x') {
			if (str.length() > 1 && str.charAt(1) == 'x') {
				str = str.substring(0, 1) + str.substring(2);
			}
			
			str = str.substring(1);
			
			return str;
		}

		if (str.length() > 1 && str.charAt(1) == 'x') {
			str = str.substring(0, 1) + str.substring(2);
		}

		return str;
	}
}
