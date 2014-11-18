/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class MaxTriple {
	public int maxTriple(int[] nums) {
		int mid = nums[(nums.length - 1) / 2];
		int last = nums[nums.length - 1];

		if (nums[0] > mid) {
			mid = nums[0];
		}

		if (mid > last) {
			last = mid;
		}

		return last;
	}
}
