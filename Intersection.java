package string;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size = sc.nextInt();
		System.out.println("Enter the details of the first array");
		int arr1[] = new int[9];
		for(int i =0;i<9;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Entered elements are : "+ Arrays.toString(arr1));
		
		/*System.out.println("Enter the details of the Second array");
		int arr2[] = new int[size];
		for(int i =0;i<size;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Entered elements are : "+ Arrays.toString(arr2));
		
		//f.intersection(arr1, arr2, size);*/
		find f =new find();
		//int[] num =f.threeSum(arr1, size);
		//System.out.println("output position of element "+Arrays.toString(num));
		//f.sortZeroOne(arr1);
		f.sortZeroOneTwo(arr1);
		  
		sc.close();
	}

}

class find{
	
	public void intersection(int arr1[],int arr2[],int size) {
		
		for(int i=0;i<size;i++) {
			int element = arr1[i];
			for(int j=0;j<size;j++) {
				if(element < arr2[j])
					break;
				if(element == arr2[j]) {
					System.out.println("Desired number" +element);
					arr2[j] = -11234;
					break;
				}
			}
		}
		
	}
	
	public void intersection1(int arr1[],int arr2[], int size) {
		int i=0,j=0;
		while(i<size && j<size) {
			if(arr1[i] == arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}else if(arr1[i] < arr2[j]) {
				i++;
				
			}else {
				j++;
			}
			
			
		}
	}
	
	///A method can return a reference to an array. The return type of a method must be declared as an array of the correct data type.
	//
	public int[] threeSum(int arr[], int target) {
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				for(int k=j+1;k<=arr.length-1;k++) {
					if(arr[i]+arr[j]+arr[k] == target) {
						return new int[] {arr[i],arr[j],arr[k]}; 
							
					}
				}
			}
		}
		return null;
	}
	
	public void print(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	
	
	public void sortZeroOne(int arr[]) {
		
		int i=0;
		int j=arr.length-1;
		
		while(i < j) {
			while(arr[i]==0 && i<j) {
				i++;
			}
			
			while(arr[j]==1 && i<j) {
				j--;
			}
			
			if(i<j) {
				int temp = 0;
				temp=arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
				i++;
				j--;
				
			}else {
				System.out.println("The array is already sorted with zero and one");
			}
			
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print("" +arr[i]);
		}
		System.out.println(" ");
		
	}
	
	public void sortZeroOneTwo(int arr[]) {
		
		int count0=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				count0++;
			else if(arr[i]==1)
				count1++;
			else
				count2++;	
		}
		
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<(count0+count1);i++) {
			arr[i]=1;
		}
		for(int i=(count0+count1);i<count2;i++) {
			arr[i]=2;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("" +arr[i]);
		}
		System.out.println(" ");
		
	}
	
	
}	
	