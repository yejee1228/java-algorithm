package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("실행 0.종료, 1.사칙연산계산기, 2.BMI, 3.얼마에요?, 4.회원가입, 5.윤달, 6.월계산기, 7.합격여부, 8.랭킹, 9.성적표, 10.덧셈계산기, 11.세금계산기, 12.초 계산기");
		switch(scanner.nextInt()) {
		case 0 : System.out.println("종료"); break;
		case 1:
			System.out.println("1. 사칙연산 계산기");
			System.out.println("첫번째 값:");
			int fir = scanner.nextInt();
			System.out.println("연산자: +, -, *, / : ");
			String op = scanner.next();
			System.out.println("두번째 값:");
			int sec = scanner.nextInt();
			String result = student.getAc(fir, op, sec);
			System.out.println(result);
		break;
		case 2: 
			System.out.println("BMI계산기");
			System.out.println("키를 입력하세요(m)");
			double length = scanner.nextDouble();
			System.out.println("몸무게를 입력하세요(kg)");
			double weight = scanner.nextDouble();
			result = student.getBmi(weight, length);
			System.out.println(result);
			break;
		case 3 :
			System.out.println("얼마에요?");
			int cost = scanner.nextInt();
			System.out.println(String.format("%d원 입니다", cost));
			System.out.println("몇개 드릴까요?");
			int num = scanner.nextInt();
			System.out.println(String.format("%d개 주세요", num));
			int won = cost*num;
			System.out.println(String.format("%d원입니다", won));
			System.out.println("비싸요, 10% 깎아주세요.");
			result = student.howMuch(cost, num, won);
			System.out.println(result);
			break;
		case 4 : 
			System.out.println("== 회원가입시스템== ");
			String [] join = { "id", "pw", "이름", "생년월일(예) 1990-05-05", "성인여부(성인,미성년)", "키(소수점 첫째자리까지)", "몸무게(소수점 첫째자리까지)", "혈액형"};
			String [] person = new String[8];
			for (int i = 0; i<join.length; i++) {
				System.out.println(join[i]+" : ");
				person[i] = scanner.next();
			}
			System.out.println("== 회원정보 ==");
			result = student.join(person,join);
			System.out.println(result);
			break;
		case 5 :
			System.out.println("연도를 입력하시오:");
			int year = scanner.nextInt();
			result = student.getLeapYear(year);
			System.out.println(result);
			break;
		case 6 :
			System.out.println("월을 입력하세요");
			int month = scanner.nextInt();
			result = student.getMonthEndDay(month);
			System.out.println(result);		
			break;
		case 7 :
			System.out.println("시험 결과");
			System.out.print("이름을 입력하세요: ");
			String name = scanner.next();
			System.out.print("국어 점수를 입력하세요: ");
			int kor = scanner.nextInt();
			System.out.print("영어 점수를 입력하세요: ");
			int eng = scanner.nextInt();
			System.out.print("수학 점수를 입력하세요: ");
			int math = scanner.nextInt();
			result = student.getPassOrFail(name,kor,eng,math);
			System.out.println(result);
			break;
		case 8 :
			String[] people = new String[3];
			double[] score = new double[3];
			for(int i=0; i<3; i++) {
				System.out.println("선수의 이름을 입력해 주십시오.");
				people[i] = scanner.next();
				System.out.println("선수의 기록을 입력해 주십시오.");
				score[i] = scanner.nextDouble();
			}
			result = student.getRank(people, score);
			System.out.println(result);
			break;
		case 9 :
			System.out.println("성적표 프로그램");
			System.out.println("학생 이름을 입력하세요.");
			name = scanner.next();
			System.out.println("국어점수를 입력하세요.");
			kor = scanner.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scanner.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scanner.nextInt();
			result = student.getReportCard(name, kor, eng, math);
			System.out.println(result);
			break;
		case 10 :
			System.out.println("합계와 평균 계산기");
			int sum = 0;
			int aval = 0;
			int a = 0;
			int[] numb = new int[300];
			int plus = 0;
			int count =0;
			String dap = "";
			while(true) {
			System.out.println("더하려는 숫자를 입력하세요(종료는 -1)");
			plus= scanner.nextInt();
			
				if(plus == -1) {
					dap = "=";
					break;
				}else {			
					numb [a] = plus;
					sum += plus;
				}
				count ++;
				a++;
			}
			aval = sum / count;
			
			result = student.getScoreCalc(sum, aval, a, numb, plus, count, dap);
			System.out.println(result);
			break;
		case 11 :
			System.out.println("이름을 입력하세요");
			name = scanner.next();
			System.out.println("연봉을 입력하세요(만원)");
			int income = scanner.nextInt();
			result = student.getTax(name, income);
			System.out.println(result);
			break;
		case 12 :
			System.out.println("초를 입력하세요.");
			sec = scanner.nextInt();
			result = student.getTimeCalc(sec);
			System.out.println(result);
			break;
			
		}
		}
	}
		
}
