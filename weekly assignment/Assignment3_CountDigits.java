package day2;

public class Assignment3_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987654;
		int count=0;
		
		while (num >0) {
			count++;
			num=num/10;
			
		}
        System.out.println("Number of digits =" +count);
	}

}
