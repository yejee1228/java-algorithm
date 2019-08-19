package homework02;
//*****다시!!
import java.util.Scanner;

/*
 * To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.
A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면
###### 성적 랭킹 #######
1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)
라고 출력시켜주세요.
 */
public class Ranking {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String[] people = new String[3];
		double[] score = new double[3];
		String pa="", pb = "", pc = "";
		double a=0, b=0, c=0;
		for(int i=0; i<3; i++) {
			System.out.println("선수의 이름을 입력해 주십시오.");
			people[i] = scanner.next();
			System.out.println("선수의 기록을 입력해 주십시오.");
			score[i] = scanner.nextDouble();
		}
		if(score [0]>score [1] && score[0]>score[2]) {
			if(score[1]>score[2]) {
				a = score[2];
				b = score[1];
				c = score[0];
				pa = people[2];
				pb = people[1];
				pc = people[0];
			}else {
				a = score[1];
				b = score[2];
				c = score[0];
				pa = people[1];
				pb = people[2];
				pc = people[0];
			}
		}else if(score [1]>score[2] && score [1]>score[0]) {
			if(score[2]>score[0]) {
				a = score[0];
				b = score[2];
				c = score[1];
				pa = people[0];
				pb = people[2];
				pc = people[1];
			}else {
				a = score[2];
				b = score[0];
				c = score[1];
				pa = people[2];
				pb = people[0];
				pc = people[1];
			}
		}else {
			if(score [0]>score[1]) {
				a = score[1];
				b = score[0];
				c = score[2];
				pa = people[1];
				pb = people[0];
				pc = people[2];
			}else {
				a = score[0];
				b = score[1];
				c = score[2];
				pa = people[0];
				pb = people[1];
				pc = people[2];
			}
		}
		System.out.println("###### 성적 랭킹 #######");
		System.out.printf("\n1등 : %s 선수 기록 (%.1f초)\n2등 : %s 선수 기록 (%.1f초)\n3등 : %s 선수 기록 (%.1f초)", pa,a,pb,b,pc,c);
	}

}