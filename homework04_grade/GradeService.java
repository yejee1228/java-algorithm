package homework04_grade;

import javax.swing.JOptionPane;

public class GradeService {
	public String getTotal(Grade grade) {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int sum = kor + eng + math;
		grade.setSum(sum);
		String total = String.valueOf(sum);
		return total;
	}
	public String getAvg(Grade grade) {
		int sum = grade.getSum();
		int aval = sum / 3;
		grade.setAval(aval);
		String avg = String.valueOf(aval);
		return avg;
	}
	public String getPass(Grade grade) {
		String pass = "";
		int aval = grade.getAval();
		if (aval >= 90) {
			pass = "장학생";
		}else if (aval >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		return pass;
	}
}
