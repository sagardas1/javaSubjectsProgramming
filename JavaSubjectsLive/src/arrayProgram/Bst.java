package arrayProgram;

class Node {
	int data;
	Node left;
	Node right;

}

public class Bst {
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		Node root = null;
		root = binarySearch.insert(root, 10);

		binarySearch.inOrder(root);
		root = binarySearch.delete(root, 10);

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

	public Node delete(Node root, int i) {
		if (root == null) {
			return null;
		}

		if (i < root.data) {
			root.left = delete(root.left, i);
		} else if (i > root.data) {
			root.right = delete(root.right, i);
		} else {
			if (root.left == null || root.right == null) {
				Node temp = null;
				temp = root.left == null ? root.right : root.left;

				if (temp == null) {
					return null;
				} else {
					return temp;
				}
			} else {
				// Node successor = getSuccessor(root);
			}
		}
		return null;
	}

//	private Node getSuccessor(Node root) {
//		if (root == null) {
//			return null;
//		}
//
//		return null;
//	}

	public void inOrder(Node root) {
		if (root == null) {
			return;

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