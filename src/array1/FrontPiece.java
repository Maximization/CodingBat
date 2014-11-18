/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class FrontPiece {
	public int[] frontPiece(int[] nums) {
		if (nums.length < 2) {
			return nums;
		}
		
		int[] a = { nums[0], nums[1] };

		return a;
	}
}
