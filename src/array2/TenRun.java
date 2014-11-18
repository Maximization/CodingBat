/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class TenRun {
	public int[] tenRun(int[] nums) {
		boolean ten = false;
		int a = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				ten = true;
				a = nums[i];
			}

			if (ten) {
				nums[i] = a;
			} else {
				nums[i] = nums[i];
			}
		}

		return nums;
	}
}
