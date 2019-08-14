package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		String result = "";
		int sum = 0;
		for(int i = 1 ; i<=5 ; i++) {
			result += (i ==5 || i==4) ? i+" = " : i+" + ";
			sum += i;
			}	
		System.out.print(result+ sum);
	}
}


//result += (i == 5) ? i+" = " : i+" + ";