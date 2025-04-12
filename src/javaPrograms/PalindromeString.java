package javaPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="MADAM";
		String originalStr=name;
		String revStr="";
		//reverse the string
		for(int i=name.length()-1;i>=0;i--) {
			revStr = revStr+name.charAt(i);
		}
		if(originalStr.equals(revStr)) {
			System.out.println(originalStr+" is Palindrome String");
		}else {
			System.out.println(originalStr+" is NOT Palindrome String");
		}
		
	}

}
