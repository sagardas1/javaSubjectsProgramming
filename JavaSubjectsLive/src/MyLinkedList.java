public class MyLinkedList {
	 
	 static Node head; 
	  
	    static class Node { 
	  
	        int data; 
	        Node next; 
	  
	        Node(Object data) { 
	            data =(int)data; 
	            next = null; 
	        } 
	        Node(Object data,Node next) { 
	            data =(int)data; 
	           next = this.next; 
	        } 
	    } 
	    Node first;
	Node last;
	int count;
	
	
	void add(Object e) {
		if(first==null) {
			first=new Node(e);
			count++;
			return;
		}
		else {
			last=new Node(e);
			last=last.next;
		
			count++;
		return;
			
		}
		
	}
	int size() {
		System.out.println(count);
		return count;
	}
	
		Object get(int index) {
			if(index>=size()) {throw new IndexOutOfBoundsException();}
			else {
				Node temp=first;
				for(int i=0;i<index;i++) {
					temp=temp.next;
				}
			return	temp.data;
			}
			
		}
		
		
		
		
		void add(Object ele,int index) {
			if(index>=size()) {throw new IndexOutOfBoundsException();}
			else {
				Node temp=first;
				for(int i=0;i<=index;i++) {
					temp=temp.next;
					
				}
				temp.next=new Node(ele,temp.next);
				count++;
			}
			
		}
		
		void remove(int index) {
			Node temp;
			if(index>=size()) {throw new IndexOutOfBoundsException();}
			
			else {
				temp=first;
				for(int i=0;i<=index;i++) {
					temp=temp.next;
					
				}}
			temp.next=temp.next.next;
			count--;
		}
		
		
		  Node reverse(Node node) { 
		        Node prev = null; 
		        Node current = node; 
		        Node next = null; 
		        while (current != null) { 
		            next = current.next; 
		            current.next = prev; 
		            prev = current; 
		            current = next; 
		        } 
		        node = prev; 
		        return node; 
		    } 
		  void printList(Node node) { 
		        while (node != null) { 
		            System.out.print(node.data + " "); 
		            node = node.next; 
		        } 
		    } 
		  public static void main(String[] args) {
			  MyLinkedList list = new MyLinkedList(); 
		       list.add(10);
		       list.add(20);

		       list.add(30);

		       list.add(40);

		       list.add(50);

		       list.add(60);
		       list.size();
		        head = list.reverse(head); 
		        list.printList(head); 
		}
		  
	}
	
	
 