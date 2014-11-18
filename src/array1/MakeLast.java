/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class MakeLast {
	public int[] makeLast(int[] nums) {
		int[] a = new int[nums.length * 2];
		a[a.length - 1] = nums[nums.length - 1];

		return a;
	}
}
