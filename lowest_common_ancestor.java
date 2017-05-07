# Lowest Common Ancestor

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int key;
	Node right;
	Node left;
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
class Ideone
{
	public static void insert(int key){
		Node node = new Node(key);
		if(Node.root == null){
			Node.root = node;
			return;
		}
		Node curr = Node.root;
		Node par = null;
		while(true){
			par = curr;
			if(curr.key < key){
				curr = curr.right;
				if(curr == null){
					par.right = node;
					return;
				}
			}
			else{
				curr = curr.left;
				if(curr == null){
					par.left = node;
					return;
				}
			}
		}
	}
	public static void display(Node root){
		if(root != null){
			display(root.left);
			System.out.print(root.key+" ");
			display(root.right);
		}
	}
	public static Node lowestAncestor(Node root, int A, int B){
		if(root == null){
			return root;
		}
		if(root.key == A || root.key == B){
			return root;
		}
		Node left = lowestAncestor(root.left, A, B);
		Node right = lowestAncestor(root.right, A, B);
		if(left != null && right != null){
			return root;
		}
		if(left == null){
			return right;
		}
		else{
			return left;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[]{4,2,3,6,1,7,5,8,9};
		for(int i=0;i<array.length;i++){
			insert(array[i]);
		}
		display(Node.root);
		System.out.println((lowestAncestor(Node.root, 1, 4)).key);
	}
}