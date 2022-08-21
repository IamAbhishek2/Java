package string;


public class Normal {

	public static void main(String[] args) {
		
		
		linkedList1 ll = new linkedList1();
		
		ll.insert(ll,10);
		ll.insert(ll, 20);
		ll.insert(ll, 50);
		ll.insert(ll, 40);
		
		

		ll.print(ll);
		ll.insertAtPos(ll, 60, 0);
		ll.print(ll);
	}

}


class linkedList1{ //created a class named linked List
	
	Node head; //defined Node as a head
	
	 class Node{ //defined a new class as a Node inside class linkedList
		
		int data; //data 
		Node next; // next is the pointer which will point to the next node of the linked List
		
		Node(int data){ // constructor is created with one argument which take an input as an integer which is data
			
			this.data = data;
			this.next = null;
			
		}
	}
	
	public  linkedList1 insert(linkedList1 list, int data) { // created a method with list and data as an argument 
		
		Node new_node = new Node(data); // created a new_node with providing input as an data
		new_node.next = null; 
		
		if(list.head == null) { // if the linked list is empty 
			list.head = new_node; // put the new node in the head 
		}else {
			Node last = list.head; // placing last --> pointing to list head
			while(last.next != null) { // traverse last till the last node --> empty
				last = last.next; 
			}
			
			last.next = new_node;//put the new node at the last of the last.next
		}
		
		return list; //return the list
	}
	
	
	public linkedList1 insertAtPos(linkedList1 list, int data, int pos) {
		
		Node new_node = new Node(data);
				
		if(pos==0) {
			list.head = new_node;
			
			return list;
		}
		
		int counter=0;
		while(list.head != null) {
			if(counter == pos) {
				list.head=new_node;
				break;
			}else {
				Node temp = list.head;
				temp= temp.next;
				counter++;
			}
		}
		
		
		return list;
	}
	
	void print(linkedList1 list) {
		
		Node temp =list.head;
		
		System.out.println("LinkedList :");
		
		while(temp!=null) {
			
			System.out.println(temp.data + " ");
			
			temp = temp.next;
		}
	}
}