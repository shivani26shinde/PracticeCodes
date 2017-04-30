# Creating a graph using Adjacency list

import java.util.*;
import java.lang.*;
import java.io.*;

class Graph{
	class Edge{
		int v, w;
		public Edge(int v, int w){
			this.v = v;
			this.w = w;
		}
		public String toString(){
			return v+"--weighs-->"+w;
		}
		
	}
	List<Edge> array[];
	public Graph(int n){
		array = new LinkedList[n];
		for(int i=0;i<n;i++){
			array[i] = new LinkedList<>();
		}
	}
	void addEdge(int u, int v, int w){
		array[u].add(0, new Edge(v, w)); // Time complexity to add at the begining of LL is O(1)
	}
	boolean isConnected(int u, int v){
		if(array[u] == null){
			return false;
		}
		for(Edge i:array[u]){
			if(i.v == v){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		String res = "";
		for(int i=0;i<array.length;i++){
			res = res + i + "--->" + array[i] +"\n";
		}
		return res;
	}
}

class ExampleGraph{
	public static void main (String[] args) throws java.lang.Exception
	{
		Graph g = new Graph(10);
		g.addEdge(0,2,5); g.addEdge(1,2,4); g.addEdge(2,3,3); g.addEdge(0,5,1);
		g.addEdge(4,2,5); g.addEdge(8,2,17); g.addEdge(6,3,26);
		//System.out.println(g);
		//System.out.println(g.isConnected(0,8));
		//System.out.println(g.isConnected(3,8));
		//System.out.println(g.isConnected(4,2));
	}
}