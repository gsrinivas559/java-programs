package javaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbersAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach1 - using Random Class
		Random rm = new Random();
		int number = rm.nextInt(100);
		System.out.println(number);
		
		double randomDouble = rm.nextDouble(); //range 0.0 and less than 1.0
		System.out.println(randomDouble);
		
		//Approach2 - using Math class
		System.out.println(Math.random()); //range 0.0 and less than 1.0
		
		//Approach3 - using Appache commons api
		System.out.println(RandomStringUtils.randomNumeric(5));
		System.out.println(RandomStringUtils.randomAlphabetic(5));
		System.out.println(RandomStringUtils.randomAlphanumeric(5));
		
	}

}
