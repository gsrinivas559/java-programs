package javaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbersAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach1 - using Random Class
		Random rm = new Random();
		int number = rm.nextInt(100); //Random integers between 0 and 100 using Random class
		System.out.println(number);
		
		double randomDouble = rm.nextDouble(); //range 0.0 and less than 1.0
		System.out.println(randomDouble);
		
		//Approach2 - using Math class
		System.out.println(Math.random()); //range 0.0 and less than 1.0
		int max=50,min=0;
		int diff=max-min;
		System.out.println((int) (Math.random() * diff)); //Random integers between 0 and 50 using Math.random()
		
		//Approach3 - using Appache commons api
		System.out.println(RandomStringUtils.randomNumeric(5));
		System.out.println(RandomStringUtils.randomAlphabetic(5));
		System.out.println(RandomStringUtils.randomAlphanumeric(5));
		
		//Approach4 - using logic to generate random string
		StringBuilder sbuilder=new StringBuilder();
		String chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i=0;i<10;i++) { //10 is how much length
			int index=(int) (Math.random() * chars.length());
			sbuilder.append(chars.charAt(index));
		}
		System.out.println("Random String: "+sbuilder.toString());
	}

}
