/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class AlarmClock {
	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day >= 1 && day <= 5) {
				return "10:00";
			} else {
				return "off";
			}
		}

		if (day >= 1 && day <= 5) {
			return "7:00";
		} else {
			return "10:00";
		}
	}
}
