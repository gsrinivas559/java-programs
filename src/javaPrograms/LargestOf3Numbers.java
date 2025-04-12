package javaPrograms;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=50, c=30;
		//Approach1 - usnig control Statements
		if(a>b && a>c) {
			System.out.println(a+" is largest number");
		}else if(b>a && b>c){
			System.out.println(b+" is largest number");
		}else {
			System.out.println(c+" is largest number");
		}
		
		//Approach2 - using ternary operator
		/*int largest = a>b ? a : b;
		int finallargest = c>largest ? c : largest;
		*/
		int largest = c>(a>b?a:b)? c : (a>b?a:b);
		System.out.println(largest+" is largest number");
	}

}
