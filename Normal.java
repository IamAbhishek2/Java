package string;


public class Normal {

	public static void main(String[] args) {
		
		
		linkedList1 ll = new linkedList1();
		
		System.out.println("Count of nodes is :" +ll.getCount(ll));
		ll.insert(ll,10);
		ll.insert(ll,20);
		ll.insert(ll,50);
		ll.insert(ll,40);
		
		ll.insertAtPos(ll, 60, 4);
		ll.print(ll);
		//System.out.println("Count of nodes is :" +ll.getCount(ll));
		
		//ll.deleteNode(4, ll);
		ll.deleteNode(5, ll);
		ll.print(ll);
		System.out.println("Count of nodes is :" +ll.getCount(ll));
	}

}


class linkedList1{ 
	
	Node head; 
	
	 class Node{ 
		
		int data;  
		Node next;
		
		Node(int data){ 
			
			this.data = data;
			this.next = null;
			
		}
	}
	
	public  linkedList1 insert(linkedList1 list, int data) { 
		
		Node new_node = new Node(data); 
		new_node.next = null; 
		
		if(list.head == null) { 
			list.head = new_node; 
		}else {
			Node last = list.head; 
			while(last.next != null) { 
				last = last.next; 
			}
			
			last.next = new_node;
		}
		
		return list; 
	}
	
	
	public int getCount(linkedList1 list) {
		Node temp = list.head;
		int count =0;
		
		while(temp != null) {
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	
	public linkedList1 insertAtPos(linkedList1 list, int data, int pos) {
		
		Node temp = list.head;
		int count = 0;
		
		if(pos == 0) {
			Node new_node = new Node(data);
			new_node.next = list.head;
			list.head = new_node;
			
			return list;
		}
		
		if(pos>getCount(list)) {
			
			System.out.println("Please enter lower position");
		}
		
		while(count<pos-1) {
			 temp = temp.next;
			 count++;
		}
		
		Node new_node = new Node(data);
		new_node.next = temp.next;
		temp.next = new_node;
		
		return list;
	}
	
	
	public linkedList1 deleteNode(int index , linkedList1 list) {
		
		Node curr_node = list.head, prev =null;
		
		if(index == 0 && curr_node != null) {
			list.head = curr_node.next;
			System.out.println( index + " position element deleted ");
			
			return list;
		}
		int counter = 0;
		while(curr_node != null) {
			if(counter == index) {
				prev.next = curr_node.next;
				System.out.println(index + "Position element deleted");
				break;
			}else {
				prev = curr_node;
				curr_node = curr_node.next;
				counter++;
			}
		}
		
		if(curr_node == null) {
			
			System.out.println(index + " Positioned is not there in the list");
			
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