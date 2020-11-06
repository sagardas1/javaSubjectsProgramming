class Node {

	Node left;
	Node right;
	int data;

}

public class BST {
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		Node root = null;
		root = search.insert(root, 10);
		root = search.insert(root, 2);
		root = search.insert(root, 4);
		root = search.insert(root, 3);
		root = search.insert(root, 7);
		search.inOrder(root);

	}

}

class BinarySearch {

	public Node insert(Node root, int i) {
		if (root == null) {
			return createNewNode(i);
		}
		if (i < root.data) {
			root.left = insert(root.left, i);
		} else if (i > root.data) {
			root.right = insert(root.right, i);
		}
		return root;
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}

		
		
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);

	}

	private Node createNewNode(int i) {
		Node n = new Node();
		n.left = null;
		n.right = null;
		n.data = 10;

		return n;
	}

}