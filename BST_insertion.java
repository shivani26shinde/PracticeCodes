# Insertion in BST

import java.util.*;
import java.lang.*;
import java.io.*;

// Node class
class Node
{
	int key;
	Node left;
	Node right;
	public static Node root;
	
	// Constructor
	public Node(){
		root = null;
	}
	// Constructor
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
	}
}	

//BST class
class BST
{	
	// Function to insert a node
	public static void insert(int key){
		
		// create a new node having the given value
		Node newnode = new Node(key);
		
		// Root node is empty
		if(Node.root == null){
			Node.root = newnode;
			return;
		}
		Node curr = Node.root;
		Node parent = null;
		
		while(true){
			parent = curr;
			
			// Node will be inserted in the left subtree
			if(key < curr.key){
				curr = curr.left;
				if(curr == null){
					parent.left = newnode;
					return;
				}
			}
			
			// Node will be inserted in the right subtree
			else{
				curr = curr.right;
				if(curr == null){
					parent.right = newnode;
					return;
				}
			}
		}
	}
	
	// Inorder traversal
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.key);
			display(root.right);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BST b = new BST();
		b.insert(3);b.insert(8);b.insert(6);b.insert(2);b.insert(10);b.insert(20);
		b.insert(1);b.insert(4);b.insert(9);b.insert(25);b.insert(15);b.insert(16);
		b.insert(5);b.insert(7);b.insert(51);b.insert(2);b.insert(35);b.insert(21);
		b.display(Node.root);
	}
}