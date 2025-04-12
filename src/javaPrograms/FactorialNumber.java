package javaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial Num - multiples of a num
		//5! = 5 * 4 * 3 * 2 * 1 = 120
		int num = 5;
		int sum = 1;
		for(int i=num;i>0;i--) {
			sum = sum * i;
		}
		System.out.println("Factorial of a number:"+num+" is : "+sum);
	}

}
