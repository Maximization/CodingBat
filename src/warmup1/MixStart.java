/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class MixStart {
	public boolean mixStart(String str) {
		return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
	}
}
