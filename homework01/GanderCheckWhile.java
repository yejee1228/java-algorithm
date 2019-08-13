package homework01;

import java.util.Scanner;

public class GanderCheckWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("성별 체크기");
			System.out.println("이용하시겠습니까? 이용하시려면 1, 종료하시려면 0을 눌러주세요.");
			int start = scan.nextInt();
			switch(start) {
			case 1:
				System.out.print("주민번호를 입력하세요. (-포함): ");
				String ssn = scan.next();
				int num = Integer.parseInt(ssn.substring(7,8));
				String eval = "";
				switch(num) {
				case 9 : eval = "1800 ~ 1899년에 태어난 남성"; break;
				case 0 : eval = "1800 ~ 1899년에 태어난 여성"; break;
				case 1 : eval = "1900 ~ 1999년에 태어난 남성"; break;
				case 2 : eval = "1900 ~ 1999년에 태어난 여성"; break;
				case 3 : eval = "2000 ~ 2099년에 태어난 남성"; break;
				case 4 : eval = "2000 ~ 2099년에 태어난 여성"; break;
				case 5 : eval = "1900 ~ 1999년에 태어난 외국인 남성"; break;
				case 6 : eval = "1900 ~ 1999년에 태어난 외국인 여성"; break;
				case 7 : eval = "2000 ~ 2099년에 태어난 외국인 남성"; break;
				case 8 : eval = "2000 ~ 2099년에 태어난 외국인 여성"; break;
				}
				System.out.println(eval + "입니다.");break;
			case 0 :
				System.out.println("이용해주셔서 감사합니다."); return;
			default : 
				System.out.println("잘못입력하셨습니다."); break;
			}
			
		}
		
	}

}
