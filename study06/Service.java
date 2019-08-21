package study06;

public class Service {
	public String getBmi(Member member) {
		String result = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight / (height * height);
		double bmi3 = Math.round(bmi * 100) / 100.0;
		String eval = "";
		if (bmi3 > 30.0) {
			eval = "고도비만";
		}else if (bmi3 > 25.0) {
			eval = "경도비만";
		}else if (bmi3 > 23.0) {
			eval = "과체중";
		}else if (bmi3 > 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
		result = String.format("당신의 BMI 지수는 %.1f입니다.\n당신은 %s입니다.", bmi3, eval);	
		return result;
	}
	public String getReportCard(Member member) {
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int sum = kor + eng + math;
		int aval = sum / 3;
		String pass = "";
		if (aval >= 90) {
			pass = "장학생";
		}else if (aval >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		String result= String.format("학생   국어   영어   수학   총점   평균   합격여부\n"
				+ "===============================\n"
				+"%s  %d  %d  %d  %d  %d  %s", name, kor, eng, math, sum, aval, pass);
		return result;
	}
	public String getTax(Member member) {
		double rate = 9.7 / 100;
		int income = member.getIncome();
		String name = member.getName();
		double tax = Math.round(income * rate);
		String result = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.0f만원 입니다.", income, name, tax);
		return result;
	}
}
