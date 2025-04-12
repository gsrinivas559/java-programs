package javaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci series - sum of two preceeding numbers is equal to the next num
		//0 1 1 2 3 5 8 13
		int num1 = 0, num2 =1;
		System.out.print(num1+" "+num2);
		int num = 10;
		int sum=0;
		for(int i=2;i<num;i++) {
			sum = num1+num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
		}
	}

}
