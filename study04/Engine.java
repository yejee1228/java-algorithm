package study04;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0. 종료  1. BMI  2. 이해못할 문제");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return; //메소드가 void일 경우에는 아무것도 붙일 수 없음. 원래는 뒤에 "" 를 붙이면 무언가를 남기고 메소드 종료함.
			case 1 : System.out.println("1. BMI: 이름, 키, 몸무게 입력");
				String name = scanner.next();
				double height = scanner.nextDouble();
				double weight = scanner.nextDouble();
				String result = student.getBmi(name, height, weight);
				System.out.println(result);
			break;
			case 2 :
				//이름, 주소, 나이, 은행잔고, 신용도
				//결과가 무조건 1억 대출
				System.out.println("이름을 입력하시오.");
				name = scanner.next();
				System.out.println("주소를 입력하시오.");
				String add = scanner.next();
				System.out.println("나이를 입력하시오.");
				int age = scanner.nextInt();
				System.out.println("은행잔고를 입력하시오.");
				int money = scanner.nextInt();
				System.out.println("신용도를 입력하시오.");
				String faith = scanner.next();
				
				result = student.dc(name, add, age, money, faith);
				System.out.println(result);
				break;
			}
		}

	}

}
