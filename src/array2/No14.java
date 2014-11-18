/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class No14 {
	public boolean no14(int[] nums) {
		boolean gotone = false;
		boolean gotfour = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				gotone = true;
			} else if (nums[i] == 4) {
				gotfour = true;
			}
		}

		return (gotone != gotfour || !gotone && !gotfour);
	}
}
