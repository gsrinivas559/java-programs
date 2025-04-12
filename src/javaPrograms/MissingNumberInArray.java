package javaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditions - should be in range, no need to be in order, should not have duplicates
		int a[]= {1,2,3,4,5,7,8,9,10};
		int sum1=0, sum2=0;
		//to know the sum of elements in array
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		//to know the sum of elements in range from 1 to 5
		for(int i=1;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println("Missing Element is: "+(sum2-sum1));
	}

}
