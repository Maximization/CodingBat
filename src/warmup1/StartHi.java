/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class StartHi {
	public boolean startHi(String str) {
		if (str.length() < 2) {
			return false;
		}
		
		return (str.substring(0, 2).equals("hi"));
	}
}
