package tg.edu;

import java.util.Scanner;

import tg.edu.util.Calc;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("몇개의 숫자를 입력하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		
		int inputCnt;
		inputCnt = sc.nextInt();
		
		System.out.println();

		int num = 0;
		for (int i = 0; i < inputCnt; i++) {
			
			System.out.print("숫자를 입력하세요:");
			num = sc.nextInt();
			
			Calc calc = new Calc(num);
		};
		
 
	}
	


}

