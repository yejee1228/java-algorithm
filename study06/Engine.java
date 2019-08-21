package study06;

import java.util.Scanner;

public class Engine {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.Join 2.정보보기 3.아이디찾기 4.BMI 5.성적표 6.세금계산기");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 :
				member = new Member(); // Member 리얼월드 member 소프트웨어
				System.out.println("== 회원가입시스템== ");
				System.out.print("id:");
				member.setId(scanner.next());
				System.out.print("pw:");
				member.setPw(scanner.next());
				System.out.print("이름:");
				member.setName(scanner.next());
				System.out.print("주민번호:");
				member.setSsn(scanner.next());
				System.out.print("키(m):");
				member.setHeight(scanner.nextDouble());
				System.out.print("몸무게(kg)");
				member.setWeight(scanner.nextDouble());
				System.out.print("혈액형:");
				member.setBlood(scanner.next());
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				System.out.println("영어점수");
				member.setEng(scanner.nextInt());
				System.out.println("수학점수");
				member.setMath(scanner.nextInt());
				System.out.println("연봉(만원)");
				member.setIncome(scanner.nextInt());
				break;
			case 2 :
				System.out.println(member.toString());
				break;
			case 3 :
				System.out.println("이름과 아이디 입력하면 비번과 주민번호  알려줌.");
				String serchName = scanner.next();
				String serchId = scanner.next();
				if(serchName.equals("a")&&
						serchId.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n", member.getPw(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
					}
				break;
			case 4 : 
				System.out.println("BMI구하기");
				System.out.println(service.getBmi(member));
				break;
			case 5 :
				System.out.println("성적표");
				System.out.println(service.getReportCard(member));
				break;
			case 6 :
				System.out.println("세금계산기");
				System.out.println(service.getTax(member));
				break;
			}
		}
		
	}

}
