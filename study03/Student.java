package study03;

import java.util.Scanner;

public class Student {
//1.BMI 2Ranking 3. HowMuch 4. ReportCard
	public String getBmi(double length, double weight) {
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
	String result = "";
	return result = String.format("당신의 BMI 지수는 %.1f입니다./n당신은 %s입니다.", bmi3, eval);	
	}
	public String getRanking(String[] people, double[] score) {
    	
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
		System.out.println("###### 성적 랭킹 #######");
		System.out.printf("\n1등 : %s 선수 기록 (%.1f초)\n2등 : %s 선수 기록 (%.1f초)\n3등 : %s 선수 기록 (%.1f초)", pa,a,pb,b,pc,c);
		return "등수를 계산중...";
	}
	public void howMuch() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("얼마에요?");
		int cost = scanner.nextInt();
		System.out.println(String.format("%d원 입니다", cost));
		System.out.println("몇개 드릴까요?");
		int num = scanner.nextInt();
		System.out.println(String.format("%d개 주세요", num));
		int won = cost*num;
		System.out.println(String.format("%d원입니다", won));
		System.out.println("비싸요, 10% 깎아주세요.");
		int dc = won / 10;
		won = won - dc;
		System.out.println(String.format("그럼 %d원만 주세요.", won));
		
	}
	public void getReportCard() {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적표 프로그램");
		System.out.println("학생 이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
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
		System.out.println("학생   국어   영어   수학   총점   평균   합격여부");
		System.out.println("===============================");
		System.out.println(String.format("%s  %d  %d  %d  %d  %d  %s", name, kor, eng, math, sum, aval, pass));
	}
	
}
