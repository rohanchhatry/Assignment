package day2;

public class Assignment3_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int sum=0;
		
		while (num >0) {
			int digit = num % 10;
			
			sum = sum + (digit * digit * digit);
			    num = num /10;
		}
          if (sum == temp) {
        	  
        	  System.out.println(temp + " is an Armstrong number");
          } else {
        	  System.out.println(temp + " is not an Armstrong number");
          }
	}

}
