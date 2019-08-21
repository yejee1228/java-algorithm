package homework04_calendar;

public class CalendarService {
	public String getEndDay(MyCalendar myCalendar) {
		int month = myCalendar.getMonth();
		String eval = "";
		switch (month) {
		case 1 : eval = "31일"; break;
		case 2 : eval = "29일"; break;
		case 3 : eval = "31일"; break;
		case 4 : eval = "30일"; break;
		case 5 : eval = "31일"; break;
		case 6 : eval = "30일"; break;
		case 7 : eval = "31일"; break;
		case 8 : eval = "31일"; break;
		case 9 : eval = "30일"; break;
		case 10 : eval = "31일"; break;
		case 11 : eval = "30일"; break;
		case 12 : eval = "31일"; break;
		}
		String endDay = String.format("%d월은 %s까지 입니다.", month,eval);
		return endDay;
	}
	public String isLeapYear(MyCalendar myCalendar) {
		String leapYear = "윤년입니다";
		int year = myCalendar.getYear();
		if (year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 !=0) {
					leapYear = "평년입니다";
				}
			}
		}else {
			leapYear = "평년입니다";
		}
		return leapYear;
	}
		
}
