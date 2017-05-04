# Trie Implementation

import java.util.*;
import java.lang.*;
import java.io.*;

class TrieNode{
	char value;
	int count;
	boolean isEnd;
	LinkedList<TrieNode> list;
	public TrieNode(char c){
		value = c;
		isEnd = false;
		count = 0;
		list = new LinkedList<TrieNode>();
	}
	public TrieNode subNode(char c){
		if(list == null){
			return null;
		}
		for(TrieNode node : list){
			if(node.value == c){
				return node;
			}
		}
		return null;
	}
}
class Trie{
	public static TrieNode root;
	public Trie(){
		root = new TrieNode(' ');
	}
	public static void insert(String word){
		if(search(word) == true){
			return;
		}
		TrieNode current = root;
		char[] array = word.toCharArray();
		for(char c : array){
			TrieNode child = current.subNode(c);
			if(child != null){
				current = child;
			}
			else{
				current.list.add(new TrieNode(c));
				current = current.subNode(c);
			}
			current.count++;
		}
		current.isEnd = true;
		System.out.println("Successfully inserted");
	}
	public static boolean search(String word){
		TrieNode current = root;
		char[] array = word.toCharArray();
		for(char c : array){
			if(current.subNode(c) == null){
				return false;
			}
			current = current.subNode(c);
		}
		if(current.isEnd == true){
			return true;
		}
		return false;
	}
	public static void delete(String word){
		if(search(word) == false){
			System.out.println("Word does not exist in the trie");
			return;
		}
		TrieNode current = root;
		char[] array = word.toCharArray();
		for(char c : array){
			TrieNode child = current.subNode(c);
			if(child.count == 1){
				current.list.remove(child);
				System.out.println("Successfully deleted");
				return;
			}
			else{
				child.count--;
				current = child;
			}
		}
		current.isEnd = false;
	}
}
class TrieTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Trie trie = new Trie();
		String[] str = new String[]{"a","ana","anana","banana","na","nana"};
		for(int i=0;i<str.length;i++){
			trie.insert(str[i]);
		}
		boolean ans = trie.search("anana");
		if(ans == true){
			System.out.println("Found!!");
		}
		else{
			System.out.println("Not Found!!");
		}
		trie.delete("aa");
		trie.delete("anana");
		boolean ans1 = trie.search("anana");
		if(ans1 == true){
			System.out.println("Found!!");
		}
		else{
			System.out.println("Not Found!!");
		}
	}
}