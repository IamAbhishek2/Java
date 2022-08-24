package string;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		Dlinkedlist dl = new Dlinkedlist();
		dl.inserAtHead(dl, 10);
		dl.inserAtHead(dl, 40);
		dl.inserAtHead(dl, 13);
		dl.inserAtHead(dl, 8);
		dl.print(dl);
		dl.insertAtTail(dl, 20);
		dl.print(dl);
		dl.delete(dl, 2);
		dl.print(dl);
		/*dl.insertAtPosition(dl, 100, 6);
		dl.print(dl);
		dl.insertAtPosition(dl, 101, 4);
		dl.print(dl);
		/*dl.insertAtPosition(dl, 202, 9);
		dl.print(dl);
		/*System.out.println("total number of node " + dl.getCount(dl));
		dl.insertAtPosition(dl, 22, 4);
		dl.print(dl);
		System.out.println("total number of node " + dl.getCount(dl));
		dl.insertAtPosition(dl, 122, 6);
		dl.print(dl);
		*/
	}

}


class Dlinkedlist{
	
	Node head;
	Node tail;
	Node next;
	Node prev;
	
	public class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}
	
	public Dlinkedlist inserAtHead(Dlinkedlist list, int data) {
	
		
		
		if(head == null) {
			Node new_node = new Node(data);
			list.head=new_node;
		}else {
			
			Node new_node = new Node(data);
			new_node.next = list.head;
			list.prev = new_node;
			list.head = new_node;
		}
		return list;
	}
	
	public Dlinkedlist insertAtTail(Dlinkedlist list, int data) {
		
		
		Node new_node = new Node(data);
		Node temp = list.head;
		while(temp.next != null) {
			
			temp = temp.next;
		}
		
		temp.next =new_node;
		new_node.prev = temp;
		
		return list;
	}
	
	public Dlinkedlist insertAtPosition(Dlinkedlist list,int data, int pos) {
		
		Node temp = list.head;
		int count = 1;
		if(pos == 0) {
			inserAtHead(list,data);
			return list;
		}
		if(pos>getCount(list)+1) {
			System.out.println("Error at the POS, Kinldy check the total number of node in the list");
		}
		
		while(count < pos-1) {
			
			temp = temp.next;
			count++;
		}
		if(temp.next == null) {
			insertAtTail(list,data);
			return list;
		}
				
		Node new_node = new Node(data);
		new_node.next = temp.next;
		temp.next.prev  = new_node;
		temp.next = new_node;
		new_node.prev = temp;
		
		
		
		return list;
	}
	
	
	public Dlinkedlist delete(Dlinkedlist list, int pos) {
		
		if(pos == 0) {
			Node temp = list.head;
			temp.next.prev = null;
			list.head = temp.next;
			temp.next =  null;
			
		}else {
			
			Node curr = list.head;
			Node prev = null;
			
			int count = 0;
			while(count < pos-1) {
				prev = curr;
				curr=curr.next;
				count++;
			}
			
			curr.prev = null;
			prev.next = curr.next;
			curr.next =null;
		}
		return list;
	}
	
	
	public Dlinkedlist print(Dlinkedlist list) {
		Node temp = list.head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" ");
		return list;
	}
	
	
	public int getCount(Dlinkedlist list) {
		int count = 0;
		Node temp = list.head;
		
		while(temp != null) {
			temp =temp.next;
			count++;
		}
		
		return count;
	}
	
	
}