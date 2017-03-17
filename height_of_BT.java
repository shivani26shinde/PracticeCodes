# Height of a binary tree

class Node {
       int data;
       Node left;
       Node right;
}
int height(Node root)
{
    if (root == null)
    {
		return -1;
    }
	int leftH = height(root.left);
	int rightH = height(root.right);
	   
	if(leftH>rightH){
		return 1 + leftH;
	}
	else{
		return 1 + rightH;
	}
}
