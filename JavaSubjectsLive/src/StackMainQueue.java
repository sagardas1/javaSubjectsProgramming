import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackMainQueue {
	public static void main(String[] args) {
		PriorityQueue< Integer> pq=new PriorityQueue<Integer>();
		
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> stack1=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack1.push(stack.pop());
		stack1.push(stack.pop());
		stack1.push(stack.pop());
		
	for(int i=0;i<3;i++) {
		System.out.println(stack1.pop());
	}
	
		
	}

}
