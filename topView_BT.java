# Top view of a binary tree

class Node {
       int data;
       Node left;
       Node right;
}
void top_view(Node root)
{
    ArrayList<Integer> list = new ArrayList<Integer>();
    Node temp = root;
    list.add(root.data);
    while(root.left != null){
        root = root.left;
        list.add(root.data);
    }
    Collections.reverse(list);
    root = temp;
    while(root.right != null){
        root = root.right;
        list.add(root.data);
  }
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }    
}
