package javaPrograms;

public class EvenAndOddDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 145678;
		int originalNum = number;
		int evenCount=0;
		int oddCount=0;
		while(number!=0) {
			int digit = number%10;
			if(digit%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			number = number/10;
		}
		System.out.println("Number of even digits in a number: "+originalNum+" is : "+evenCount);
		System.out.println("Number of odd digits in a number: "+originalNum+" is : "+evenCount);
	}

}
