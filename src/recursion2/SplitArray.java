/**
 * created by Maxim Orlov on 19 Nov 2014
 */
package recursion2;

public class SplitArray {
	public boolean splitArray(int[] nums) {
		return helper(0, nums, 0, 0);
	}

	public boolean helper(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length) {
			return sum1 == sum2;
		} else if (helper(start + 1, nums, sum1 + nums[start], sum2)) {
			return true;
		} else {
			return helper(start + 1, nums, sum1, sum2 + nums[start]);
		}
	}
}
