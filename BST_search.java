# Search an element in BST

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
	
	// Function to search an element
	public static boolean search(int key){
		Node curr = Node.root;
		
		// Iterate till element found
		while(curr != null){
			
			// current root is the element
			if(curr.key == key){
				return true;
			}
			Node parent = curr;
			
			// element value is less than current root value
			if(key < curr.key){
				curr = parent.left;
			}
			
			// element value is more than current root value
			else{
				curr = parent.right;
			}
		}
		
		// element not found
		return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BST b = new BST();
		b.insert(3);b.insert(8);b.insert(6);b.insert(2);b.insert(10);b.insert(20);
		b.insert(1);b.insert(4);b.insert(9);b.insert(25);b.insert(15);b.insert(16);
		b.insert(5);b.insert(7);b.insert(51);b.insert(2);b.insert(35);b.insert(21);
		boolean val  = search(45);
		if(val == true){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
}