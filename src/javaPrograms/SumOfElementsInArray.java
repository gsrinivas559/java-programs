package javaPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20, 30, 40, 50};
		int sum = 0;
		/*//normal for loop
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of elemnets in Array is: "+sum);
		*/
		//enhanced for loop
		for(int arr:a) {
			sum = sum + arr;
		}
		System.out.println("Sum of elemnets in Array is: "+sum);
	}

}
