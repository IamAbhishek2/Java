package string;

import java.util.Arrays;
import java.util.Scanner;


public class NewPractise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i =0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered elements are : "+ Arrays.toString(arr));
		sum s = new sum();
		/*s.add(arr, size);
		System.out.println("Enter the key to find ");
		int key = sc.nextInt();
		boolean found =s.Search(arr, size, key);
		if(found) {
			System.out.println(" Hurray!! We got the key");
		}else {
			System.out.println("key is not there in the Array");
		}*/
		
		//s.reverseArray(arr, size);
		int result;
		s.findDuplicate(arr);
		
		
		sc.close();
		
		
	}

}


class sum{
	
	void add(int arr[] ,int size) {
		
		int sum1=0;
		
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1+arr[i];
		}
		
		System.out.println("The sum of the above array is :" +sum1);
	}
	
	boolean Search(int arr[],int size, int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(key == arr[i]) {
				return true;
			}
		}
			
		return false;
	}
	
	void reverseArray(int arr[],int size) {
		
		int start =0;
		int end =arr.length-1;
		int t;
		
		while(start <= end) {
			t=arr[start];
			arr[start] = arr[end];
			arr[end]=t;
			start++;
			end--;
			
			}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+ " ");	
		}
		
	}
	//brute force method
	void findDuplicate(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
				if(arr[i] == arr[i+1]) {
					System.out.println("Duplicate element found "+arr[i]);
				}		
		}
		
		
	}
	
	int duplicate(int arr[]) {
		
		int ans = 0;
		
		for(int i= 0;i<arr.length;i++) {
			ans = ans^arr[i];
		}
		
		for(int i = 1;i<arr.length;i++) {
			ans = ans^i;
		}
		return ans;
	}
	
	 int findUnique(int arr[]) {
		 int ans = 0;
		 for(int i=0;i<arr.length;i++) {
			 
			 ans = ans^arr[i];
		 }
		 return ans;
		 
	 }
		
}
	