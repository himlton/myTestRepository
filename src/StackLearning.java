import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		stack.add("Sita");
		stack.add("RamJi");
		stack.add("Hanuman Ji");
		
		System.out.println(stack.pop());
		stack.push("Lakshman Ji");
		System.out.println(stack);
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("Sita");
		queue.add("RamJi");
		queue.add("Hanuman Ji");
		System.out.println(queue.peek());
		//queue.
		
		
	}

}
