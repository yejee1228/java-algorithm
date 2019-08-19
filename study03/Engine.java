package study03;

import java.util.Scanner;
import study03.Student;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		int flag = 0;
		while(true) {
			System.out.println("메뉴: 0. 종료  1. BMI 2. Ranking 3. HowMuch 4. ReportCard");
			flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			
			
			case 1 : System.out.println("1. BMI");
			System.out.println("BMI계산기");
		System.out.println("키를 입력하세요(m)");
		double length = scan.nextDouble();
		System.out.println("몸무게를 입력하세요(kg)");
		double weight = scan.nextDouble();

		String result = student.getBmi(length, weight);
		System.out.println(result);
			break;
			
			
			
			
			case 2 : System.out.println("2. Ranking");
			String[] people = new String[3];
			double[] score = new double[3];
			
			for(int i=0; i<3; i++) {
				System.out.println("선수의 이름을 입력해 주십시오.");
				people[i] = scan.next();
				System.out.println("선수의 기록을 입력해 주십시오.");
				score[i] = scan.nextDouble();
			}	
			result = student.getRanking(people, score);
			break;
			
			
			
			case 3 : System.out.println("3. HowMuch");
				student.howMuch();
			break;
			case 4 : System.out.println("4. ReportCard");
				student.getReportCard();
			break;
			}
		}
		
	}

}
