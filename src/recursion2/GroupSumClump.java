/**
 * created by Maxim Orlov on 19 Nov 2014
 */
package recursion2;

public class GroupSumClump {
	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return target == 0;
		}

		int substract = nums[start];
		int count = 1;

		for (int i = start; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				substract += nums[i + 1];
				count++;
			} else {
				break;
			}
		}

		if (groupSumClump(start + count, nums, target - substract)) {
			return true;
		} else if (groupSumClump(start + count, nums, target)) {
			return true;
		}

		return false;
	}
}
