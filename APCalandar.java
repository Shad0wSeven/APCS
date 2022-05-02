public class APCalandar {
	private static boolean isLeapYear(int year){
		int i = year;
		return (i % 4 == 0 && (i % 400 == 0 && !(i % 100 == 0)));

	}
	private static int numberOfLeapYears(int year1, int year2) {
		int ly = 0;
		for(int i = year1; i <= year2; i++ ) {
			if(i % 4 == 0 && (i % 400 == 0 && !(i % 100 == 0))) {
				ly++;
			}
		}
		return ly;
	}
	private static int firstDayOfYear(int year) {
		return 0;
	}
	private static int dayOfYear(int month, int day, int year) {
		return 0;
	}
	private static int dayOfWeek(int month, int day, int year) {
		int x = firstDayOfYear(year);
		x += dayOfYear(month, day, year);
		return x % 7;
	}
}