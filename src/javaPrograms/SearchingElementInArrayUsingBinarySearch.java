package javaPrograms;

import java.util.Arrays;

public class SearchingElementInArrayUsingBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10}; //Should be in sorted order
		boolean flag=false;
		int searchElement=6;
		int first=0;
		int last=arr.length-1;
		int middle=(first+last)/2;
		while(first<=last) {
			if(arr[middle]<searchElement) {
				first=middle+1;
			}else if(arr[middle]==searchElement) {
				System.out.println("Element found at location: "+(middle+1));
				flag=true;
				break;
			}else {
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		if(flag==false) {
			System.out.println("Element NOT found");
		}

		//Approach2 - using Arrays.Binary search
		int index = Arrays.binarySearch(arr, 6);
		System.out.println("Element Found at index : "+index);
	}

}
