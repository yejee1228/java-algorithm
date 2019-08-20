package study05;

//bmi join reportcard, tax(salary)
public class Member {
	private String id, pw, name, ssn, blood;
	private double height, weight;
	private int kor, eng, math, income;

	public void setName(String name) {
		this.name = name; // Setter 세터
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

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return this.ssn;
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

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return this.kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getIncome() {
		return income;
	}

	@Override
	public String toString() {

		return String.format("회원정보: \n" + "이름 : %s \n" + "아이디: %s \n" + "비밀번호: %s \n" + "주민번호: %s \n" + "혈액형: %s \n"
				+ "키: %.1f \n" + "몸무게: %.1f \n", name, id, pw, ssn, blood, height, weight);
	}

}
