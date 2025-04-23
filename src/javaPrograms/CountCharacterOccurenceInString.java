package javaPrograms;

public class CountCharacterOccurenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="Java is java again";
		char c='a';
		int count=inputString.length()-inputString.replace("a", "").length();
		System.out.println("Number of occurences of "+c+" is: "+count);
	}

}
