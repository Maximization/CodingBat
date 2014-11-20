/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class UserCompare {
	public int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) < 0) {
			return -1;
		} else if (aName.compareTo(bName) > 0) {
			return 1;
		} else if (aId < bId) {
			return -1;
		} else if (aId > bId) {
			return 1;
		}

		return 0;
	}
}
