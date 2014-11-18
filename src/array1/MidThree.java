/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class MidThree {
	public int[] midThree(int[] nums) {
		int[] a = { nums[(nums.length - 1) / 2 - 1], nums[(nums.length - 1) / 2], nums[(nums.length - 1) / 2 + 1] };

		return a;
	}
}
