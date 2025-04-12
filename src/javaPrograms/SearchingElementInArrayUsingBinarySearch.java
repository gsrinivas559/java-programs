package javaPrograms;

import java.util.Arrays;

public class SearchingElementInArrayUsingBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10}; //Should be in sorted order
		boolean flag=false;
		int key=6;
		int l=0;
		int h=a.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(key==a[m]) {
				System.out.println("Element found");
				flag=true;
				break;
			}
			if(key<a[m]) {
				h=m-1;
			}
			if(key>a[m]) {
				l=m+1;
			}
		}
		if(flag==false) {
			System.out.println("Element NOT found");
		}
		
		//Approach2 - using Arrays.Binary search
		int index = Arrays.binarySearch(a, 6);
		System.out.println("Element Found at index : "+index);
	}

}
