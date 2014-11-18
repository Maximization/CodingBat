/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class CommonEnd {
	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
	}
}
