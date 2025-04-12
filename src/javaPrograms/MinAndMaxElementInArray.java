package javaPrograms;

public class MinAndMaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,20,36,43,55};
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum element in array is : "+min);
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum element in array is : "+max);
	}

}
