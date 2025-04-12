package javaPrograms;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","python","C","C++","java"};
		//Approach1 - using logic
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element found:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element NOT Found");
		}
		
		//Approach2 - using Hashset
		boolean status=false;
		HashSet<String> hs = new HashSet<String>();
		for(String a:arr) {
			if(hs.add(a)==false) {
				System.out.println("Duplicate element found:"+a);
				status=true;
			}
			
		}
		if(status==false) {
			System.out.println("Duplicate Element NOT Found");
		}
	}

}
