package homework02;

import java.util.Scanner;

/*
 * to. 개발자님
여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요

=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 

입력이 종료되면 ...아래처럼 보이게 해주세요

=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형

 */
public class Join {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("== 회원가입시스템== ");
		String [] join = { "id", "pw", "이름", "생년월일(예) 1990-05-05", "성인여부(성인,미성년)", "키(소수점 첫째자리까지)", "몸무게(소수점 첫째자리까지)", "혈액형"};
		String [] person = new String[8];
		for (int i = 0; i<join.length; i++) {
			System.out.println(join[i]+" : ");
			person[i] = scan.next();
		}
		System.out.println("== 회원정보 ==");
		for (int i=0; i<8; i++) {
			System.out.println(join[i] + " : "+ person[i]);
		}

	}

}
