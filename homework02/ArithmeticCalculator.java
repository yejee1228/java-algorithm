package homework02;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

/*
 * To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
 */
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기");
		System.out.println("첫번째 값:");
		int fir = scanner.nextInt();
		System.out.println("연산자: +, -, *, / : ");
		String op = scanner.next();
		System.out.println("두번째 값:");
		int sec = scanner.nextInt();
		String result = "";
		switch (op) {
		case "+" : result = "답: " + (fir + sec) ; break;
		case "-" : result = "답: " + (fir - sec) ; break;
		case "*" : result = "답: " + (fir * sec) ; break;
		case "/" : result = "답: " + (fir / sec) + ("[" + (fir%sec) + "]"); break;
		}
		System.out.println(result);

	}

}
