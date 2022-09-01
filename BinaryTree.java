package string;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {

	public static void main(String[] args) {
		
		Node1 root = null;
		Node1 n = new Node1();
		n.buildTree(root);
		//input tree ---> 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
		n.LevelOrderTraversal(root);

	}

}



class Node1{
	
	int data;
	Node1 left;
	Node1 right;
	
	Node1(){}
	
	Node1(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	void LevelOrderTraversal(Node1 root) {
		Queue<Node1> q = new LinkedList<Node1>();
		
		System.out.println(" "+root); //------>> prints null.
		
		while(!q.isEmpty()) {
			Node1 temp = q.peek();
			System.out.println(" "+ temp); //-------->>prints null
			System.out.print(""+temp.data);
			q.poll();
			
			if(temp.left != null) {
				q.add(temp.left);
				
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
	}
	
	//Build a Tree 
	Node1 buildTree(Node1 root) {
		
		System.out.println("Enter the data :");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		root = new Node1(data);
		if(data == -1) {
			return null;
		}
		System.out.println("Enter the data for left of "+ data);
		root.left = buildTree(root.left);
		System.out.println("Enter the data for right of "+data);
		root.right = buildTree(root.right);
		
		return root;
	}
}


