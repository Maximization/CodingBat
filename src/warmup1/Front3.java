/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class Front3 {
	public String front3(String str) {
		String front;
		
		if (str.length() >= 3) {
			front = str.substring(0, 3);
		} else {
			front = str.substring(0, str.length());
		}
		
		return front + front + front;
	}
}
