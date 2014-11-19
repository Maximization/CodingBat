/**
 * created by Maxim Orlov on 19 Nov 2014
 */
package recursion2;

public class GroupSum {
	public boolean groupSum(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return (target == 0);
		} else if (groupSum(start + 1, nums, target - nums[start])) {
			return true;
		} else if (groupSum(start + 1, nums, target)) {
			return true;
		}

		return false;
	}
}
