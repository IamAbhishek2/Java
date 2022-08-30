package string;

import java.util.Scanner;

public class RecursionPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int box = sc.nextInt();
		String arr[] = {"One","two","three","four","five","six","Seven","Eight","Nine","Ten"};
		factorial bx = new factorial();
		
		bx.sayDigit(box,arr);
		
		sc.close();
	}

}


 class factorial{
	 
	 int fact(int box) {
		 
		 if(box==0)
			 return 1;
		 
		 return box*fact(box-1);
		 
	 }
	
	 int print(int box) {
		 
		 if(box == 0)
			 return 1;
		 System.out.println("Number :" +box);
		 return print(box-1);
	 }
	 
	 int fibonacci(int c) {
		 
		 if(c == 0)
			 return 0;
		 if(c == 1)
			 return 1;
		 
		return fibonacci(c-1)+fibonacci(c-2);
				 
	 }
	 
	 int countDistinctWaysToClimbStairs(long nStairs) {
		
		 if(nStairs < 0)
			 return 0;
		 
		 if(nStairs == 0)
			 return 1;
		 
		 return countDistinctWaysToClimbStairs(nStairs - 1) + countDistinctWaysToClimbStairs(nStairs - 2);
		 
	 }
	 
	 void sayDigit(int n,String[] arr) {
		 
		if(n == 0)
			return;
		
		int digit = n % 10;
		n = n/10;
		
		sayDigit(n,arr);
		
		System.out.print(arr[digit-1]);
		 
		 
	 }
	 
}