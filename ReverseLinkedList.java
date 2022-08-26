package string;


public class ReverseLinkedList {

	public static void main(String[] args) {
		Node n = new Node(10);
		
		Node head = n;
		
		n.insert(head, 20);
		n.insert(head, 30);
		n.insert(head, 60);
		n.print(head);
		//n.reverseLinkedList(head);
		n.print(head);

	}

}

class Node{
	
	Node head;
	Node next;
	int data;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	void insert(Node head, int data) { 
		
		Node new_node = new Node(data); 
		new_node.next = null; 
		
		if(head == null) { 
			head = new_node; 
		}else {
			Node last = head; 
			while(last.next != null) { 
				last = last.next; 
			}
			
			last.next = new_node;
		}
		 
	}
	
	Node reverseLinkedList(Node head) {
		
		if((head == null) || (head.next == null)) {
			return head;
		}
			
			Node curr = head;
			Node prev = null;
			Node forward = null;
			
			while(curr != null) {
				forward = curr.next;
				curr.next = prev;
				prev = curr;
				curr = forward;
			}
		
		
		return prev;
	}
	
	
	
	 void print(Node head) {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		
		System.out.println(" ");
		
	}
	
		
}