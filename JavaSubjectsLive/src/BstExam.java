class Node1 {
	Node1 left;
	Node1 right;
	int ele;

}

public class BstExam {
	public static void main(String[] args) {

		Node1 root = null;

		Binary binary = new Binary();

		root = binary.insertEle(10, root);

		binary.inorder(root);
	}

}

class Binary {

	public Node1 insertEle(int i, Node1 root) {
		if (root == null) {
			return createNewNode(i);

		} else {
			if (i < root.ele) {
				root.left = insertEle(i, root.left);
			}
			if (i > root.ele) {
				root.right = insertEle(i, root.right);
			}
		}
		return root;
	}

	public void inorder(Node1 root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.println(root.ele);
		inorder(root.right);

	}

	private Node1 createNewNode(int i) {
		Node1 node = new Node1();
		node.left = null;
		node.right = null;
		node.ele = i;

		return node;
	}

}