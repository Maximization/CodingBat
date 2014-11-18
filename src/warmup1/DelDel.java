/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class DelDel {
	public String delDel(String str) {
		if (str.length() >= 4) {
			if (str.substring(1, 4).equals("del")) {
				return str.substring(0, 1) + str.substring(4, str.length());
			}
		}
		
		return str;
	}
}
