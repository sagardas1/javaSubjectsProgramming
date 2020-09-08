class Node{
	
	Node left;
	Node right;
	int data;
	
}

public class BST {
	public static void main(String[] args) {
		BinarySearch search=new BinarySearch();
		Node root=null;
		root=search.insert(root,10);
	}

}

class BinarySearch {

	public Node insert(Node root, int i) {
		if(root==null) {
			return createNewNode(i);
		}
		return null;
	}

	private Node createNewNode(int i) {
		Node n=new Node();
		n.left=null;
		n.right=null;
		n.data=10;
		
		return n;
	}

	
}