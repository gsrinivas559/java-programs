package javaPrograms;

public class CheckPrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime number - NaturalNumber > 1, divide by 1 and itself
		int num = 13;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num+" is a Prime Number");
			}else {
				System.out.println(num+" is NOT a Prime Number");
			}
		}else {
			System.out.println(num+" is NOT a Prime Number");
		}
		
	}

}
