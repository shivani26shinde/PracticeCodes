# Flattened LinkedList

import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList{
	static Node head;
	class Node{
		int key;
		Node right;
		Node down;
		public Node(int key){
			this.key = key;
			down = null;
			right = null;
		}
	}
	public static Node Merge(Node a, Node b){
		if(a == null){
			return b;
		}
		if(b == null){
			return a;
		}
		Node result;
		if(a.key < b.key){
			result = a;
			result.down = Merge(a.down, b);
		}
		else{
			result = b;
			result.down = Merge(a, b.down);
		}
		return result;
	} 
	public static Node Flatten(Node root){
		if(root == null || root.right == null){
			return root;
		}
		root.right = Flatten(root.right);
		root = Merge(root, root.right);
		return root;
	}
	public Node push(Node headref, int key){
		Node node = new Node(key);
		node.down = headref;
		headref = node;
		return headref;
	}
	public static void printlist(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.key+"  ");
			temp = temp.down;
		}
	}
}
class TestLinkedList{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList L = new LinkedList();
		L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);
 
        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);
 
        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);
 
        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 20);
        
        L.head = L.Flatten(L.head);
        
        L.printlist();
	}
}