/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array3;

public class CanBalance {
	public boolean canBalance(int[] nums) {
		int sum1 = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			sum1 += nums[i];
			int sum2 = 0;

			for (int j = i + 1; j < nums.length; j++) {
				sum2 += nums[j];
			}

			if (sum1 == sum2) {
				return true;
			}
		}

		return false;
	}
}
