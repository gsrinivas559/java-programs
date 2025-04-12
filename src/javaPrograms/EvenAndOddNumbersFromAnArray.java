package javaPrograms;

public class EvenAndOddNumbersFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,4,7,1,3,8,9};
		System.out.println("Even Numbers are..");
		for(int a:arr) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		System.out.println("Odd Numbers are..");
		for(int a:arr) {
			if(a%2!=0) {
				System.out.println(a);
			}
		}
	}

}
