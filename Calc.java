package tg.edu.util;

public class Calc{
	
   public Calc(int num) {
	      // TODO Auto-generated constructor stub
	      int result = 0;
	      
	      for (int i = 1; i <= num; i++) {
	         result += i;
	      }
	      System.out.println("1~" + num + " 사이의 정수 " + result);
	      System.out.println();
	   }
}