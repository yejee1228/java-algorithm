package homework04_grade;
import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		Grade grade = null;
		GradeService gradeService = new GradeService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.점수입력 2.점수합산 3.평균 4.합격여부")) {
			case "0" : JOptionPane.showMessageDialog(null, "종료"); return;
			case "1" :
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("점수입력 \n이름 입력"));
				String kor = JOptionPane.showInputDialog("국어점수 입력");
				grade.setKor(Integer.parseInt(kor));
				String eng = JOptionPane.showInputDialog("영어점수 입력");
				grade.setEng(Integer.parseInt(eng));
				String math = JOptionPane.showInputDialog("수학점수 입력");
				grade.setMath(Integer.parseInt(math));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, "합산점수: " + gradeService.getTotal(grade));
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null, "평균점수: " + gradeService.getAvg(grade));
				break;
			case "4" : 
				JOptionPane.showMessageDialog(null, gradeService.getPass(grade));
				break;
		
			}
		}
	}

}
