/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class More14 {
	public boolean more14(int[] nums) {
		int sum1 = 0;
		int sum4 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				sum1++;
			} else if (nums[i] == 4) {
				sum4++;
			}
		}

		return (sum1 > sum4);
	}
}
