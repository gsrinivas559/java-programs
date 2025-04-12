package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0;
		/*//logic1 - using algorithm
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse Number is:"+rev);
		*/
		//logic2 - using StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder revnum = sb.reverse();
		System.out.println("Reverse Number is:"+revnum);
		
		//logic2 - using StringBuffer
		StringBuffer sb1 = new StringBuffer(String.valueOf(num));
		System.out.println("Reverse Number is:"+sb1.reverse());
		
	}

}
