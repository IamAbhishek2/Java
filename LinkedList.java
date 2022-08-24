package string;

import java.util.Scanner;

public class LinkedList {
	
	
	TiffinBox start;
	
	void display(TiffinBox start) 
	{
		TiffinBox temp =start;
		while(temp !=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	TiffinBox append(String key, TiffinBox start)
	{
		TiffinBox temp = new TiffinBox(key);
		TiffinBox temp_other = start;
		
		if(temp_other == null)
		{
			start = temp;
		}
		
		else
		{
			while(temp_other.next != null)
			{
				temp_other = temp_other.next;
			}
			
			temp_other.next = temp;
		}
		
		return start;
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.start = null;
		Scanner in = new Scanner (System.in);
		do {
			
			System.out.println("\n 1. Append at the End");
			System.out.println("\n 2. Display");
			int n = in.nextInt();
			switch(n)
			{
			case 1: System.out.println("\n enter the value");
				String value = in.nextLine();
				l.append(value,l.start);
				
			case 2:
				l.display(l.start);
				break;
			}
		System.out.println("\n Press 1 to continued");
		}while(in.nextInt()==1);
		TiffinBox sat = new TiffinBox("chole bhature");
		
		System.out.println(sat.data);

	}

}

class TiffinBox{
	
	String data;
	TiffinBox next;

	TiffinBox(String data){
		this.data = data;
		this.next =null;
	}
}
