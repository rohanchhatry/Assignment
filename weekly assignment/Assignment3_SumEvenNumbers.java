package day2;

public class Assignment3_SumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int sum = 0;
		for(int i=2;i<=50;i+=2) {
         sum = sum + i;
	}
System.out.println("sum of even numbers =" +sum);
}
}