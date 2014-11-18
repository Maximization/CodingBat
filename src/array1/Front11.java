/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		if (a.length == 0 && b.length == 0) {
			int[] res = {};
			
			return res;
		} else if (a.length == 0) {
			int[] res = { b[0] };
			
			return res;
		} else if (b.length == 0) {
			int[] res = { a[0] };
			
			return res;
		} else {
			int[] res = { a[0], b[0] };
			
			return res;
		}
	}
}
