package homework04_member;

public class MemberService {
	public String getBmi(Member member) {
		String name = member.getName();
		double weight = member.getWeight();
		double height = member.getHeight();
		
		double bmi = weight / (height * height);
		double bmi3 = Math.round(bmi * 100) / 100.0;
		String eval = "";
		if (bmi3 > 30.0) {
			eval = "고도비만";
		}else if (bmi3 > 25.0) {
			eval = "비만";
		}else if (bmi3 > 23.0) {
			eval = "과체중";
		}else if (bmi3 > 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
		String result = String.format("%s님의 BMI 지수는 %.1f입니다.\n당신은 %s입니다.", name, bmi3, eval);
		return result;
	}
	public String getTax(Member member) {
		double rate = 9.7 / 100;
		String name = member.getName();
		int income = member.getIncome();
		double tax = 0.0;
		tax = Math.round(income * rate);
		String result = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.0f만원 입니다.", income, name, tax);
		return result;
	}
}
