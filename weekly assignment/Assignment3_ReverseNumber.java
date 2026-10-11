package day2;

public class Assignment3_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 12345;
		int reverse=0;
		
		for (; num>0; num=num/10) {
			int digit = num % 10;
			reverse = reverse *10 + digit;
			
		}
      System.out.println(reverse);
	}

}
