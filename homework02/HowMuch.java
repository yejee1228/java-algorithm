package homework02;

import java.util.Scanner;

/*
 * To. 개발자님

이제 여기에 프로그램을 설치하려고 합니다.
일단 화면에 보이는 문장은 아래와 같이 진행 되었으면 해요.
저희가 시장에 있는 가게다 보니까 깎아주는 기능도 탑재되야 해요.
아래 형광펜 칠한 부분은 콘솔에서는 입력값입니다.
나머지는 실제 화면에 보여지는 부분입니다.프로그램을 만들어 주세요.
그리고 앞으로 개선할 일 있으면 연락드릴께요.

"얼마에요?
> 스캐너입력값 > 100
100원 입니다.
몇개 드릴까요?
> 스캐너입력값 > 5
5개 주세요
총 금액은 500원 입니다
비싸요, 10% 깎아주세요.
그럼 450원만 주세요"

[참고] 깍아주는 공식
int dc = total / 10;
total = total - dc;
 */
public class HowMuch {

	public static void main(String[] args) {
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

}
