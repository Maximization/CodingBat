/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class IcyHot {
	public boolean icyHot(int temp1, int temp2) {
		return (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100);
	}
}
