package javaPrograms;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 145678;
		int originalNum = number;
		int count=0;
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println("Number of digits in a Number "+originalNum+" is :"+count);
	}

}
