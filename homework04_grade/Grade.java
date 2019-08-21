package homework04_grade;

public class Grade {
	private int kor, eng, math, sum, aval;
	private String name;
	

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAval() {
		return aval;
	}

	public void setAval(int aval) {
		this.aval = aval;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Grade [이름=" + name + ", 국어점수=" + kor + ", 영어점수=" + eng + ", 수학점수=" + math+"]";
	}


}
