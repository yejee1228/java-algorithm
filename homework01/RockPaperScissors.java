package homework01;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
 	
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("가위바위보 게임 시작!");
		int cum = ran.nextInt(3)+1;
		System.out.println("가위, 바위, 보 ?");
		String rps = scan.next();
		String flag = cum + rps;
		String eval = "";
		switch(flag) {
		case 1+"가위" : eval = "컴퓨터는 :가위. 비겼습니다."; break;
		case 2+"가위" : eval = "컴퓨터는 :바위. 당신이 졌습니다."; break;
		case 3+"가위" : eval = "컴퓨터는 :보. 당신이 이겼습니다."; break;
		case 1+"바위" : eval = "컴퓨터는 :가위. 당신이 이겼습니다."; break;
		case 2+"바위" : eval = "컴퓨터는 :바위. 비겼습니다."; break;
		case 3+"바위" : eval = "컴퓨터는 :보. 당신이 졌습니다."; break;
		case 1+"보" : eval = "컴퓨터는 :가위. 당신이 졌습니다."; break;
		case 2+"보" : eval = "컴퓨터는 :바위. 당신이 이겼습니다."; break;
		case 3+"보" : eval = "컴퓨터는 :보. 비겼습니다."; break;
		}
		System.out.println(eval);
	}

}
