/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class Double23 {
	public boolean double23(int[] nums) {
		if (nums.length < 2) {
			return false;
		}

		return (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3);
	}
}
