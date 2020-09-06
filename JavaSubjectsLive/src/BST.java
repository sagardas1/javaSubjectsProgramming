
class Node {
	int data;
	Node right;
	Node left;

}

public class BST {
	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		Node root = null;

		root = b.insert(root, 10);
		root = b.insert(root, 20);
		root = b.insert(root, 1);
		root = b.insert(root, 7);
		root = b.insert(root, 7);
		root = b.insert(root, 4);
		root = b.insert(root,5);
		
		
		
		b.inOrder(root);
	}

}

class BinarySearch {

	public Node insert(Node root, int i) {

		if (root == null) {
			return createNewNode(i);
		}

		if (i < root.data) {
			root.left = insert(root.left, i);

		} else if (i >= root.data) {
			root.right = insert(root.right, i);
		}

		return root;
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

		Node node = new Node();
		node.left = null;
		node.right = null;
		node.data = i;

		return node;
	}

}