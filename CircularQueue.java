package string;

public class CircularQueue {

	public static void main(String[] args) {
		Q1 q = new Q1();
		
		

	}

}


class Q1{
	
	int arr[];
	int front;
	int rear;
	int size;
	
	Q1(){};
	
	Q1(int n){
		
		size = n;
		arr = new int[size];
		front = rear =-1;
	}
	
	boolean enqueue(int value) {
		
		if((front ==0 ) && (rear == size-1) ||(rear == (front-1)%(size-1))) {
			
			System.out.println("Queue is full");
			
			return false;
			
		}else if(front==-1){
			front = rear= 0;
			arr[rear] = value; 
			
		}else if( (rear == size -1) && (front != 0)) {
			rear=0;
			arr[rear]= value;
			
		}else {
			rear++;
			arr[rear]=value;
		}
		arr[rear] = value;
		return true;
	}
	
	int dequeue() {
		if(front==-1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int ans = arr[front]; 
		arr[front]=-1;
		if(front == rear) {
			front = rear =-1;
		}else if(front == size-1) {
			front =0; // to maintain cyclic nature
		}else {
			front++;
		}
		return ans;
	}
	
}