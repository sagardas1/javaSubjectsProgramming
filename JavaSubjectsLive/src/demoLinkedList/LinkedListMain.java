package demoLinkedList;

class Node {
	int data;
	Node next;

}

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Node root = null;
		root = linkedList.insert(root, 10);
		root = linkedList.insert(root, 20);
		root = linkedList.insert(root, 40);

	root=	linkedList.insetInMiddle(root, 40, 2);
		
		root=linkedList.insertInBegaining(root,30);
		
	}
}

class LinkedList {

	public Node insert(Node root, int i) {

		if (root == null) {
			return createNode(i);
		}

		else {
			root.next = insert(root.next, i);
		}
		return root;
	}

	public Node insertInBegaining(Node root, int i) {
		
		Node node=new Node();
		node.data=i;
		node.next=root;
		return node;
	}

	public Node insetInMiddle(Node root, int data, int index) {

		for (int j = 0; j < index - 1; j++) {
			root = root.next;
		}
		Node temp = root.next;

		Node node = new Node();
		node.data = data;
		node.next = temp;
		root.next = node;
		
		return root;
	}

	private Node createNode(int i) {
		Node node = new Node();
		node.data = i;
		node.next = null;
		return node;
	}

}