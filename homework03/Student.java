package homework03;

import java.util.Scanner;

public class Student {
	
	public String getAc(int fir, String op, int sec) {
		String result = "";
		switch (op) {
		case "+" : result = "답: " + (fir + sec) ; break;
		case "-" : result = "답: " + (fir - sec) ; break;
		case "*" : result = "답: " + (fir * sec) ; break;
		case "/" : result = "답: " + (fir / sec) + ("[" + (fir%sec) + "]"); break;
		}
		return result;
	}
	
	public String getBmi(double weight, double length) {
		double bmi = weight / (length * length);
		double bmi3 = Math.round(bmi * 100) / 100.0;
		String eval = "";
		if (bmi > 30.0) {
			eval = "고도비만";
		}else if (bmi > 25.0) {
			eval = "경도비만";
		}else if (bmi > 23.0) {
			eval = "과체중";
		}else if (bmi > 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
		String result = String.format("당신의 BMI 지수는 %.1f입니다.\n당신은 %s입니다.", bmi3, eval);
		return result;
	}
	

	public String howMuch(int cost, int num, int won) {
		int dc = won / 10;
		won = won - dc;
		String result = String.format("그럼 %d원만 주세요.", won);
		return result;
	}
	
	public String join(String [] person, String [] join) {
		String result = "";
		for (int i=0; i<8; i++) {
			result += join[i] + " : "+ person[i];
			}
		return result;
	}
	
	
	public String getLeapYear(int year) {
	String leap = "";
		if (year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 ==0) {
					leap = "윤년";
				}else {
					leap = "평년";
				}
			}else {
				leap = "윤년";
			}
		}else {
			leap = "평년";
	}
		String result = String.format("%d년은 %s입니다.", year,leap);
		return result;
	}
		
	public String getMonthEndDay(int month) {
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
		String result = String.format("%d월은 %s까지 입니다.", month,eval);
		return result;
	}
	public String getPassOrFail(String name, int kor, int eng, int math) {
		int sum = kor + eng + math;
		int aver = sum / 3;
		String pass = "";
		if (aver >= 90) {
			pass = "합격입니다. 당신은 장학생입니다.";
		}else if(aver >= 70) {
			pass = "합격입니다.";
		}else {
			pass = "불합격입니다.";
		}
		String result = String.format("이름: %s, 국어점수 : %d, 영어점수: %d, 수학점수: %d\n총점은 %d점, 평균점수는 %d점 입니다.\n%s", name, kor, eng, math, sum, aver, pass);
		return result;
	}
	public String getRank(String[] people, double[] score) {
		String pa="", pb = "", pc = "";
		double a=0, b=0, c=0;
		
		if(score [0]>score [1] && score[0]>score[2]) {
			if(score[1]>score[2]) {
				a = score[2];
				b = score[1];
				c = score[0];
				pa = people[2];
				pb = people[1];
				pc = people[0];
			}else {
				a = score[1];
				b = score[2];
				c = score[0];
				pa = people[1];
				pb = people[2];
				pc = people[0];
			}
		}else if(score [1]>score[2] && score [1]>score[0]) {
			if(score[2]>score[0]) {
				a = score[0];
				b = score[2];
				c = score[1];
				pa = people[0];
				pb = people[2];
				pc = people[1];
			}else {
				a = score[2];
				b = score[0];
				c = score[1];
				pa = people[2];
				pb = people[0];
				pc = people[1];
			}
		}else {
			if(score [0]>score[1]) {
				a = score[1];
				b = score[0];
				c = score[2];
				pa = people[1];
				pb = people[0];
				pc = people[2];
			}else {
				a = score[0];
				b = score[1];
				c = score[2];
				pa = people[0];
				pb = people[1];
				pc = people[2];
			}
		}
		String result = String.format("###### 성적 랭킹 #######\n1등 : %s 선수 기록 (%.1f초)\n2등 : %s 선수 기록 (%.1f초)\n3등 : %s 선수 기록 (%.1f초)", pa,a,pb,b,pc,c);
		return result;
	}
	public String getReportCard(String name, int kor, int eng, int math) {
		int sum = kor + eng + math;
		int aval = sum / 3;
		String pass = "";
		if (aval >= 90) {
			pass = "장학생";
		}else if (aval >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		String result = String.format("학생   국어   영어   수학   총점   평균   합격여부\n===============================\n%s  %d  %d  %d  %d  %d  %s", name, kor, eng, math, sum, aval, pass);
		return result;
	}
	public String getScoreCalc(int sum, int aval, int a, int[] numb, int plus, int count, String dap) {
		String print = "현재까지의 누적값은 "+ numb[0];
		for (int i = 1; i<count; i++) {
			print += "+" + numb[i];
		}
		String result = String.format("%s%s%d이고, 평균은 %d입니다.", print, dap, sum, aval);	
		return result;
	}
	public String getTax(String name,int income) {
		double rate = 9.7 / 100;
		double tax = 0;
		tax = (int)Math.round(income * rate);
		String result = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원 입니다.", income, name, tax);
		return result;
	}
	public String getTimeCalc(int sec) {
		int min = sec / 60;
		int printSec = sec % 60;
		int printMin = min % 60;
		int hour = min / 60;
		String result = String.format("%d시간 %d분 %d초 입니다", hour, printMin, printSec);
		return result;
	}

	

}
