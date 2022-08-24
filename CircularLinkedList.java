package string;

public class CircularLinkedList {

	public static void main(String[] args) {
		circularSinglyll csl =new  circularSinglyll();
		csl.insert(csl, 10, 100);
		csl.print(csl);
		csl.deleteNode(csl, 100);
		csl.print(csl);
		/*csl.print(csl);
		csl.insert(csl, 100, 30);
		csl.print(csl);
		csl.insert(csl, 100, 60);
		csl.print(csl);
		csl.insert(csl, 30, 90);
		csl.print(csl);
		csl.deleteNode(csl, 100);
		csl.print(csl);
		csl.deleteNode(csl, 90);
		csl.print(csl);*/
	}

}


class circularSinglyll {
	
	Node tail;
	
	class Node{ 
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
			
		}
	}
	
	public circularSinglyll insert(circularSinglyll list, int element, int data) {
		
		if(list.tail == null) {
			Node temp = new Node(data);
			list.tail = temp;
			temp.next = temp;
		}else {
			
			Node curr = list.tail;
			while(curr.data != element) {
				
				curr = curr.next;
			}
			
			Node new_node = new Node(data);
			new_node.next = curr.next;
			curr.next = new_node;
			
			
		}
		
		return list;
	}
	
	public circularSinglyll deleteNode(circularSinglyll list, int element) {
		
		if(list.tail == null) {
			
			System.out.println(" list is empty, please check again!!!");
			return list;
		}else {
				
			Node prev = list.tail;
			Node curr = prev.next;
			
			while(curr.data != element) {
				prev = curr;			
				curr = curr.next;
			}
			
			if(curr == prev) {
				list.tail = null;
			}
			
			if(list.tail == curr) {
				list.tail = curr.next;
			}
			
			
			prev.next = curr.next;
			curr.next = null;
			
		}
		
		return list;
	}
	
	public circularSinglyll print(circularSinglyll list) {
		
		Node temp = list.tail;
		if(list.tail == null) {
			System.out.println("list is empty ");
			return list;
		}
		do {
			System.out.print(tail.data + " ");
			tail = tail.next;
		}
		while(tail != temp); 
		System.out.println(" ");
				
		return list;
	}
	
	
	
}