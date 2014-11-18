/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class CenteredAverage {
	public int centeredAverage(int[] nums) {
		int sum = 0;
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}

			if (nums[i] < min) {
				min = nums[i];
			}

			sum += nums[i];
		}

		return (sum - min - max) / (nums.length - 2);
	}
}
