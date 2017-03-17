# Is it a binary tree?

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/

boolean min(Node root, int min, int max)
{      
	if(root == null)
		return true; 
	else if(root.data < min || root.data > max){
		return false;
	}
	else{
		return (min(root.left, min, root.data-1) && min(root.right, root.data+1, max));
	}          
}
boolean checkBST(Node root) {
	if ((min(root, Integer.MIN_VALUE, Integer.MAX_VALUE))){
		return true;
	}            
	else{
		return false;
	}
}