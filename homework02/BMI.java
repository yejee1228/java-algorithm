package homework02;

import java.util.Scanner;

/*
 * To. 개발자님
사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)

Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86

(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
       이랍니다.

 */
public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("BMI계산기");
		System.out.println("키를 입력하세요(m)");
		double length = scan.nextDouble();
		System.out.println("몸무게를 입력하세요(kg)");
		double weight = scan.nextDouble();
		double bmi = weight / (length * length);
		double bmi3 = Math.round(bmi * 100) / 100.0;
				
		if (bmi > 30.0) {
			System.out.printf("당신의 BMI 지수는 "+ bmi3+ "입니다.");
			System.out.println("당신은 고도비만입니다.");
		}else if (bmi > 25.0) {
			System.out.printf("당신의 BMI 지수는 "+ bmi3 + "입니다.");
			System.out.println("당신은 비만입니다.");
		}else if (bmi > 23.0) {
			System.out.printf("당신의 BMI 지수는 "+ bmi3 + "입니다.");
			System.out.println("당신은 과체중입니다.");
		}else if (bmi > 18.5) {
			System.out.printf("당신의 BMI 지수는 "+ bmi3 + "입니다.");
			System.out.println("당신은 정상입니다.");
		}else {
			System.out.printf("당신의 BMI 지수는 "+ bmi3 + "입니다.");
			System.out.println("당신은 저체중입니다.");
		}
			
	}

}
