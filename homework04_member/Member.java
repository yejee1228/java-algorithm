package homework04_member;

//bmi join reportcard, tax(salary)
public class Member {
	private String id, pw, name, birth, blood;
	private double height, weight;
	private int income;


	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public String getName() {
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return this.pw;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getBlood() {
		return this.blood;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return this.weight;
	}

	
	@Override
	public String toString() {

		return String.format("회원정보 \n" + "이름 : %s \n" + "아이디: %s \n" + "비밀번호: %s \n" + "생년월일: %s \n" + "혈액형: %s \n"
				+ "키: %.1f m\n" + "몸무게: %.1f kg\n", name, id, pw, birth, blood, height, weight);
	}

}
