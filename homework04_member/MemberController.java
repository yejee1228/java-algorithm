package homework04_member;
import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
		Member member = null;
		MemberService memberService = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.마이페이지 3.BMI 4.세금계산")) {
			case "0" : JOptionPane.showMessageDialog(null, "0.종료"); return;
			case "1" : 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("1.회원가입 \nID입력"));
				member.setPw(JOptionPane.showInputDialog("Pw입력"));
				member.setName(JOptionPane.showInputDialog("이름입력"));
				member.setBirth(JOptionPane.showInputDialog("생년월일입력"));
				member.setBlood(JOptionPane.showInputDialog("혈액형입력"));
				String heigth=JOptionPane.showInputDialog("키(m)입력");
                member.setHeight(Double.parseDouble(heigth));
				String weight=JOptionPane.showInputDialog("몸무게(kg)입력");
				member.setWeight(Double.parseDouble(weight));
				String income = JOptionPane.showInputDialog("연봉 입력");
				member.setIncome(Integer.parseInt(income));
				break;
			case "2" : JOptionPane.showMessageDialog(null, "2.마이페이지\n"+member.toString());	
				break;
			case "3" : JOptionPane.showMessageDialog(null, "3.BMI\n"+memberService.getBmi(member));
				break;
			case "4" : JOptionPane.showMessageDialog(null, "4.Tax\n"+memberService.getTax(member));
				break;
			}
		}
	}

}
