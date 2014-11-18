/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		int[] a = { nums[nums.length / 2 - 1], nums[nums.length / 2] };

		return a;
	}
}
