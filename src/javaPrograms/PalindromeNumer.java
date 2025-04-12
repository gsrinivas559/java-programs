package javaPrograms;

public class PalindromeNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16461;
		int orignialNum=num;
		int revNum = 0;
		//reverse the num
		while(num!=0) {
			revNum = revNum*10 + num%10;
			num = num/10;
		}
		if(orignialNum==revNum) {
			System.out.println(orignialNum+" Number is Palindrome");
		}else {
			System.out.println(orignialNum+" Number is NOT Palindrome");
		}
	}

}
