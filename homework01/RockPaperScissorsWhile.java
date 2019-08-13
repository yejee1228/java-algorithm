package homework01;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			System.out.println("가위바위보 게임");
			System.out.print("시작하려면 1, 종료시에는 0을 누르시오: ");
			int start = scan.nextInt();
			switch(start) {
			case 0 : System.out.println("이용해주셔서 감사합니다.");return;
			case 1 : 
				int cum = ran.nextInt(3)+1;
				System.out.print("가위, 바위, 보 ? 끝내려면 0:");
				while(true) {
					String rps = scan.next();
					String flag = cum + rps;
					String eval = "";
					switch(flag) {
					case 1+"가위" : eval = "컴퓨터는 가위. 비겼습니다."; break;
					case 2+"가위" : eval = "컴퓨터는 바위. 당신이 졌습니다."; break;
					case 3+"가위" : eval = "컴퓨터는 보. 당신이 이겼습니다."; break;
					case 1+"바위" : eval = "컴퓨터는 가위. 당신이 이겼습니다."; break;
					case 2+"바위" : eval = "컴퓨터는 바위. 비겼습니다."; break;
					case 3+"바위" : eval = "컴퓨터는 보. 당신이 졌습니다."; break;
					case 1+"보" : eval = "컴퓨터는 가위. 당신이 졌습니다."; break;
					case 2+"보" : eval = "컴퓨터는 바위. 당신이 이겼습니다."; break;
					case 3+"보" : eval = "컴퓨터는 보. 비겼습니다."; break;
					case 1+"0" : 
						System.out.println("이용해주셔서 감사합니다."); return;
					case 2+"0" : 
						System.out.println("이용해주셔서 감사합니다."); return;
					case 3+"0" : 
						System.out.println("이용해주셔서 감사합니다."); return;
					}
					
				System.out.println(eval);
				System.out.print("가위, 바위, 보 ? 끝내려면 0:");
			}
		}
		
	}
		
	}

}
