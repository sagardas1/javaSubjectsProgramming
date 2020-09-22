package dummyBSTpackage;

class Node {

	int data;
	Node left, right;

}

public class BinarySearchTree {
	public static void main(String[] args) {
		BST bst = new BST();
		Node root = null;
		root = bst.insertNode(root, 10);
		
		bst.inOrder(root);
		
		
	}
}

class BST {

	public Node insertNode(Node root, int i) {
		if (root == null) {
			return createNewNode(i);
		}
		if (i < root.data) {
			root.left = insertNode(root.left, i);
		} else if (i > root.data) {
			root.right = insertNode(root.right, i);
		}
		return root;
	}

	public void inOrder(Node root) {
		if(root==null) {
			return ;
			
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	}

	private Node createNewNode(int i) {
		Node node = new Node();
		node.data = i;
		node.left = null;
		node.right = null;

		return node;
	}

}