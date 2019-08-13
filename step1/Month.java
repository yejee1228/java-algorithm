package step1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Month {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		int month = Integer.parseInt(today.substring(5,7));
		String eval = "";
		switch(month) {
		case 1 : eval = month + "월 입니다."; break;
		case 2 : eval = month + "월 입니다."; break;
		case 3 : eval = month + "월 입니다."; break;
		case 4 : eval = month + "월 입니다."; break;
		case 5 : eval = month + "월 입니다."; break;
		case 6 : eval = month + "월 입니다."; break;
		case 7 : eval = month + "월 입니다."; break;
		case 8 : eval = month + "월 입니다."; break;
		case 9 : eval = month + "월 입니다."; break;
		case 10 : eval = month + "월 입니다."; break;
		case 11 : eval = month + "월 입니다."; break;
		case 12 : eval = month + "월 입니다."; break;
		}
		System.out.println(eval);
	}

}
//ctrl+d: 한줄 삭제