
public class StackUsingLinkList {

	Node head;
	
	class Node {
		int value;
		Node next;
	}
	

	public StackUsingLinkList() {
		head = null;
	}
	
	//push = add value at the beginning of the list
	
	public void push(int value) {
		Node extraNode = head;
		head = new Node();
		head.value = value;
		head.next=extraNode;
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("stack is empty");
		}
		
		int value = head.value;
		head = head.next;
		return value;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkList ls = new StackUsingLinkList();
		System.out.println(ls.pop());
		ls.push(100);
		

	}

}
