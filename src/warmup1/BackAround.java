/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class BackAround {
	public String backAround(String str) {
		int last = str.length() - 1;
		
		return str.substring(last) + str + str.substring(last);
	}
}
