package javaPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {500,300,200,400,100};
		System.out.println("Array Before sorting: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		//sorting
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("Array after sorting: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
