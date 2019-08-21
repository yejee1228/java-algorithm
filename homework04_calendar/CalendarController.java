package homework04_calendar;
import javax.swing.JOptionPane;

public class CalendarController {

	public static void main(String[] args) {
		MyCalendar myCalendar = null;
		CalendarService calanderService = new CalendarService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료, 1.월-일수 알림 2.윤년계산")) {
			case "0" : JOptionPane.showMessageDialog(null, "종료"); return;
			case "1" : 
				myCalendar = new MyCalendar();
				String month = JOptionPane.showInputDialog("월을 입력하세요.");
				myCalendar.setMonth(Integer.parseInt(month));
				JOptionPane.showMessageDialog(null, calanderService.getEndDay(myCalendar));
				break;
			case "2" : 
				myCalendar = new MyCalendar();
				String year = JOptionPane.showInputDialog("연도를 입력하세요.");
				myCalendar.setYear(Integer.parseInt(year));
				JOptionPane.showMessageDialog(null, calanderService.isLeapYear(myCalendar));
				break;
			}
		}
	}

}
