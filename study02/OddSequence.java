package study02;

import java.util.Scanner;

public class OddSequence {

	public static void main(String[] args) {
		//1+3+5+7+9 =
		//condition: i%2 = 0 이면 짝수, 1이면 홀수
		Scanner scan = new Scanner(System.in);
		String seq = "";
		System.out.println("시작값:");
		int start = scan.nextInt();
		System.out.println("종료값:");
		int end = scan.nextInt();
		int sum=0;
		for(int i=start; i<=end; i++) {
			/*
			int end2 = 0;
			if(end%2 == 0){
				end2 = end -1;
			}else {
				end2=end;
			}
			if(i%2 == 1) {
				if (i != end2) {
					seq += i + "+";
				}else {
					seq += i;
				}
			}
			end2 값을 넣어서 다시 정의함.
			 */
			/**
			 * if(i%2 == 1) {
			
				if (i != end-1 && i != end) {
					seq += i + "+";
				}else {
					seq += i;
				}
			}
			 */
			sum += i;
			}
		System.out.println(seq +"="+ sum);
	}
}
