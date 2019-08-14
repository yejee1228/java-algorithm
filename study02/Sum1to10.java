package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i<=10 ; i++) {

			/**
			if(i == 5) {
				result += i+"=";
			}else{
				result += i+"+";
				}
				*/
			System.out.print((i == 10) ? i+" = " :  i+" + "); 
			sum += i;
			}	
		System.out.println(sum);
		
		
		
		
			/*switch(i) {
			case 5 : System.out.print(i + "=");break;
			default : System.out.print(i + "+");break;
			}
			*/
			/*switch는 무조건 =만 가능. case에 변수가 들어갈 수 없다.
			변수를 넣을 경우에는 if문을 사용.
		int max = 5;
		for(int i = 1 ; i<=max ; i++) {
			System.out.print(i);
			if(i == max) {
				System.out.print(i + "=");
			}else{
				System.out.print(i + "+");
				}
			}	
			*** !=같지 않으면
			한 경우에만 if로 들어갈거면, switch문보다 if문이 낫다.
			*/
		

	}

}
