package linkedList1;

class Node {
	Node next;
	int data;

}

public class LinkedList {
	public static void main(String[] args) {

		LinkedListImpli impli = new LinkedListImpli();
		Node root = null;
		root = impli.add(root, 10);
		root = impli.add(root, 3);

		System.out.println("hfbsh");
	}

}

class LinkedListImpli {

	public Node add(Node root, int i) {

		if (root == null) {
			return createNode(i);

		}
		if (root != null) {
			root.next = add(root.next, i);
		}

		return root;

	}

	private Node createNode(int i) {
		Node a = new Node();
		a.data = i;
		a.next = null;
		return a;
	}

}