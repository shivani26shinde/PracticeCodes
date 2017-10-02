import java.io.*;
import java.util.*;

public class Solution {

    static int val = -1;
    static List<Integer> list = new ArrayList<>();
    static Queue<Integer> queue = new PriorityQueue<>();
    static int searchNodes(Node root, int value){
        find(root, false);
        for(int i=0;i<list.size();i++){
            queue.add(list.get(i));
        }
        /*while(queue != null){
            System.out.print(queue.peek());
            System.out.print(" ");
            queue.poll();
        }*/
        return val;
    }

    static void find(Node root, boolean flag){
        if(root == null){
            return;
        }
        if(root != null && flag == true){
            list.add(root.value);
        }
        find(root.below, false);
        find(root.next, false);
    }
    static class Node{
        int value;
        Node next;
        Node below;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int res;
        int nodes_rows = 0;
        nodes_rows = Integer.parseInt(in.nextLine().trim());
        Node root = new Node(0);
        Node lineHead = null;
        Node aboveNode = null;
        for(int i=0;i<nodes_rows;i++){
            if(lineHead == null){
                lineHead = root;
                aboveNode = null;
            }
            else {
                lineHead.below = new Node(lineHead.value);
                aboveNode = lineHead;
                lineHead = lineHead.below;
            }
            Node current = lineHead;
            String[] stringArray = in.nextLine().split(" ");
            int[] intArray = new int[stringArray.length];
            for(int j=0;j<stringArray.length;j++){
                String numberAsString = stringArray[j];
                intArray[j] = Integer.parseInt(numberAsString);
            }
            for (int nextInt : intArray){
                while (aboveNode != null && aboveNode.next != null && nextInt > aboveNode.next.value){
                    aboveNode = aboveNode.next;
                    current.next = new Node(aboveNode.value);
                    current = current.next;
                    aboveNode.below = current;
                }
                current.next = new Node(nextInt);
                current = current.next;
            }
            while (aboveNode != null && aboveNode.next != null){
                aboveNode = aboveNode.next;
                current.next = new Node(aboveNode.value);
                current = current.next;
                aboveNode.below = current;
            }
        }
        int val;
        val = Integer.parseInt(in.nextLine().trim());
        res = searchNodes(root, val);
        System.out.println(String.valueOf(res));
    }
}
