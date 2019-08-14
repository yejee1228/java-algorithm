package study02;

import java.util.Scanner;

public class EvenSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값과 끝값 까지의 짝수의 합구하기");
		int start, end, end2 = 0;
		int ser = 0;
		String seq = "";
		System.out.print("시작값:");
		start = scan.nextInt();
		System.out.print("끝값:");
		end = scan.nextInt();
		for(int i = start; i<end; i++) {
			if (end%2 == 0) {
				end2 = end;
			} else {
				end2 = end-1;
			}
			if (i%2 == 0) {
				if(i != end2) {
					seq += i +"+";
				}else {
					seq += i + "=";
				}
			}
			ser += i;
			}
		System.out.println(seq + ser);
	
	}

}
