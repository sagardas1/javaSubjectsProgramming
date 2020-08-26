package bst;

public class MybinarySearchTree {

	class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
			left = right = null;
		}

	}

	Node root;

	MybinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;

		}
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

}
