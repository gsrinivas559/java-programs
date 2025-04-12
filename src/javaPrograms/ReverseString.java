package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "java";
		String revStr = "";
		/*//logic1 - using +(String concatenation)operator
		for(int i = name.length()-1; i>=0; i--) {
			revStr = revStr + name.charAt(i);
		}
		System.out.println("Reverse String is :"+revStr);
		
		//logic2 - using charArray
		char[] nameChar = name.toCharArray();
		for(int i=nameChar.length-1;i>=0;i--) {
			revStr = revStr + nameChar[i];
		}
		System.out.println("Reverse String is :"+revStr);
		*/
		//logic3 - using StringBuffer
		StringBuffer sb = new StringBuffer(name);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse String is :"+rev);
	}

}
