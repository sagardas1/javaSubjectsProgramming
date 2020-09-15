package doublyLinkedList;
class Node{
	
	int data ;
	Node previous;
	Node next;
	
}
public class MyDoublyLinkedlList {
public static void main(String[] args) {
	DoublyLinked doublyLinked=new DoublyLinked();
	Node root=null;
	root=doublyLinked.insert(root,10);
	
}
}
class DoublyLinked{

	public Node insert(Node root, int i) {
	if(root==null) {
		return createNewNode(i);
	}
		return null;
	}

	private Node createNewNode(int i) {
	Node node=new Node();
	node.data=i;
	node.previous=null;
	node.next=null;
		return node;
	}
	
}