package string;



public class LinearQueue {

	public static void main(String[] args) {
	Q q = new Q();
	q.enqueue(12);
	q.enqueue(24);
	q.enqueue(42);
	
	q.front();
	q.isEmpty();
	q.dequeue();
	q.front();
		
	}

}

class Q{
	
	int arr[];
	int front;
	int rear;
	int size;
	
	Q(){
		size = 10001;
		arr = new int[size];
		front = 0;
		rear =0;
	}
	
	void enqueue(int data) {
		if(rear == size) {
			System.out.println("queue is full");
		}else {
			arr[rear]=data;
			rear++;
		}
	}
	
	int dequeue() {
		
		int ans =arr[front];
		
		if(front == rear) {
			front=0;
			rear=0;
			System.out.println("Queue is empty");
		}else {
			arr[front] =-1;
			front++;
				
			}
		
		return ans;
	}
	
	int front() {
		
		if(front== rear) {
			return -1;
		}else {
			
			return arr[front];
		}
		
	}
	
	boolean isEmpty() {
		
		if(front == rear) {
			return true;
		}else
			return false;
	}
}