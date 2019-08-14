package homework02;

import java.util.Scanner;

/*
 *  To. 개발자님
       * 프로그램을 하나 개발해야 합니다.
       * 교수는 학생과 국어, 영어, 수학점수만 입력하면
       * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
       * 오더는 다음과 같이 화면에 출력하라고 합니다.
       * 학생           국어        영어        수학        총점        평균        합격여부
       * =======================================================
       * 홍길동     90       90      90     270      90       (장학생)
       * 합격여부는 다음과 같다고 합니다.
       * 평균이 90점 이상이면 장학생
       * 70점 이상 90점미만 이면 합격
       * 70미만이면 불합격이라고 하네요.
       * 단) 평균에서 소수점이하는 절삭입니다.

 */
public class PassOrFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시험 결과");
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		System.out.print("국어 점수를 입력하세요: ");
		int kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		int eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		int math = scan.nextInt();
		int sum = kor + eng + math;
		int aver = sum / 3;
		System.out.println(String.format("이름: %s, 국어점수 : %d, 영어점수: %d, 수학점수: %d", name, kor, eng, math));
		System.out.println(String.format("총점은 %d점, 평균점수는 %d점 입니다.", sum, aver));
		if (aver >= 90) {
			System.out.println("합격입니다. 당신은 장학생입니다.");
		}else if(aver >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		}

}
