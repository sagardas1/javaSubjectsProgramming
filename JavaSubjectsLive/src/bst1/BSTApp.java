package bst1;

class Node{
	Node right;
	Node left;
	int data;
	
	
}
public class BSTApp {
	public static void main(String[] args) {
		BST bst=new  BST();
		Node root=null;
		root=bst.insert(root,10);
		root=bst.insert(root,1);
		root=bst.insert(root,2);
		root=bst.insert(root,6);
		
		root=bst.insert(root,4);
		root=bst.insert(root,4);
		
		bst.inOrder(root);
		
		bst.preOrder(root);
		
	}
	
	
}

class BST{

	public Node insert(Node root, int i) {
		if(root==null) {
			return createNewNode(i);
			
		}
		if(i<root.data) {
			root.left=insert(root.left,i);
		}
		else if(i>=root.data) {
			root.right=insert(root.right, i);
		}
		return root;
	}

	public void preOrder(Node root) {
	if(root==null) {
		return;
		
	}
	System.out.print (root.data+" ");
	preOrder(root.left);
	preOrder(root.right);
	}

	public void inOrder(Node root) {
		if(root==null) {
			return;
			
		}
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	}

	private Node createNewNode(int i) {
	Node n=new Node();
	n.right=null;
	n.left=null;
	n.data=i;
		return n;
	}
	
	
}