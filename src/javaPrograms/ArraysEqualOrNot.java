package javaPrograms;

import java.util.Arrays;

public class ArraysEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		//Approach1 - using Algorithm
		boolean flag=true;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					flag=false;
				}
			}
		}else {
			flag=false;
		}
		if(flag==true) {
			System.out.println("Arrays are Equal");
		}else {
			System.out.println("Arrays are NOT Equal");
		}
		//Approach2 - using Arrays class
		boolean status = Arrays.equals(a1, a2);
		if(status==true) {
			System.out.println("Arrays are Equal");
		}else {
			System.out.println("Arrays are NOT Equal");
		}
	}

}
