package linkedList1;

class Node {
	int data;
	Node next;

}

public class LinkedList {
	public static void main(String[] args) {
		LinkedListImpli impli = new LinkedListImpli();
		Node root = null;
		root = impli.insert(root, 10);

		root = impli.insert(root, 20);
		root = impli.insert(root, 60);
		root = impli.insert(root, 80);

		// impli.printAllValue(root);

		// insert in first
		System.out.println("--------------------------------------------");
		root = impli.insertInFirst(root, 100);

		impli.printAllValue(root);

		System.out.println("--------------------------------------------");
		impli.insertInMiddle(root, 40, 3);
		impli.printAllValue(root);

//		System.out.println("--------------------------------------------");
//
//		impli.deleteLastNode(root);
//		impli.printAllValue(root);
//
//		System.out.println("--------------------------------------------");
//
//		root = impli.deleteFrontNode(root);
//		impli.printAllValue(root);

		System.out.println("--------------------------------------------");

		impli.deleteElementAtGivenPosition(root, 4);
		impli.printAllValue(root);

	}
}

class LinkedListImpli {

	int count = 0;

	public Node insert(Node root, int i) {
		if (root == null) {
			return createNewNode(i);
		}

		else {

			root.next = insert(root.next, i);
		}
		return root;
	}

	public void deleteElementAtGivenPosition(Node root, int index) {
		for (int i = 0; i < index - 1; i++) {
			root = root.next;

		}
		Node temp = root.next.next;

		root.next = temp;

	}

	public Node deleteFrontNode(Node root) {
		Node temp = root.next;
		return temp;

	}

	public void deleteLastNode(Node root) {
		for (int i = 0; i < count - 2; i++) {
			root = root.next;

		}
		root.next = null;

	}

	void insertInMiddle(Node root, int val, int index) {
		for (int i = 0; i < index - 1; i++) {
			root = root.next;

		}
		Node temp = root.next;
		Node node = new Node();
		node.data = val;
		root.next = node;
		node.next = temp;
		count += 1;

	}

	public Node insertInFirst(Node root, int i) {
		count += 1;

		Node temp = new Node();
		temp.data = i;
		temp.next = root;
		return temp;
	}

	public void printAllValue(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printAllValue(root.next);

	}

	private Node createNewNode(int i) {
		count += 1;
		Node node = new Node();
		node.data = i;
		node.next = null;
		return node;
	}

	public boolean checkCircular(Node root) {

		if (root == null) {
			return false;

		}

		Node slow = root;
		Node fast = root;
		while (slow.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow.data == fast.data) {
				return true;
			}

		}
		return false;

	}
}
