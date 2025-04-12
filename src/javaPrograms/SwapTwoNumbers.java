package javaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("Before Swaping:"+"a:"+a+" b:"+b);
		/*//logic1 - swap using third var
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swaping:"+"a:"+a+" b:"+b);
		
		//logic2 - swap using +- operators
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping:"+"a:"+a+" b:"+b);
		
		//logic3 - swap using *and/ operators
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swaping:"+"a:"+a+" b:"+b);
		
		//logic4 - swap using XOR(^) operator[converts into binary decimal values]
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swaping:"+"a:"+a+" b:"+b);
		*/
		//logic5 - using single statement
		b = a+b-(a=b);
		System.out.println("After Swaping:"+"a:"+a+" b:"+b);
	}

}
