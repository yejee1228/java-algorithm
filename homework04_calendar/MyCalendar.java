package homework04_calendar;
//윤년 월마다 며칠?
public class MyCalendar {
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int month, year;
}
