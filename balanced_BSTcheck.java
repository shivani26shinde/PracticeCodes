# Binary tree is balanced -- No Abs(height of left subtree - height of right subtree) > 1

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int key;
	Node left;
	Node right;
	public static Node root;
	public Node(){
		root = null;
	}
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
	}
}
class BstVarification
{
	// Creating a BST
	public static void BST(int key){
		Node newN = new Node(key);
		if(Node.root == null){
			Node.root = newN;
			return;
		}
		Node curr = Node.root;
		Node par = null;
		while(true){
			par = curr;
			if(key < curr.key){
				curr = curr.left;
				if(curr == null){
					par.left = newN;
					return;
				}
			}
			else{
				curr = curr.right;
				if(curr == null){
					par.right = newN;
					return;
				}
			}
		}
	}
	
	// Displaying a BST
	public static void display(Node root){
		if(root != null){
			display(root.left);
			System.out.print(root.key+"  ");
			display(root.right);
		}
	}
	
	// Recursion logic to check its balanced
	public static int isBalanced(Node root){
	
		// Root is null
		if(root == null){
			return 0;
		}
		
		// Recursively find heights of left and right sub-trees
		int h1 = isBalanced(root.left);
		int h2 = isBalanced(root.right);
		
		// One of the heights is -1 indicates its no longer balanced tree
		if(h1 == -1 || h2 == -1){
			return -1;
		}
		
		// Difference in the heights
		if(Math.abs(h1-h2) > 1){
			return -1;
		}
		
		// Differenceis less than 1
		if(h1>h2){
			return h1+1;
		}
		else{
			return h2+1;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[]{5,6,3,4,7,2};
		for(int i=0;i<array.length;i++){
			BST(array[i]);
		}
		display(Node.root);
		int ans = isBalanced(Node.root);
		if(ans > -1){
			System.out.println("TRUE!!");
		}
		else{
			System.out.println("FALSE!!");
		}
	}
}