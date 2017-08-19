package stack;

public class Stack {

	Node first;

	public Stack() {
		first = null;
	}

	public Stack(Node a) {
		first = a;
	}

	public void push (int data) {							// Duplicates are welcome
		Node newLink = new Node(data);
		newLink.next = first;
		first = newLink;
	}

	public Node pop() {
		if (!isEmpty()){
			Node toReturn = new Node(first);
			first = first.next;
			return toReturn;
		}else{
			return null;
		}
	}
	
	public boolean isEmpty(){
	    if (first==null)
	        return true;
	    else
	        return false;
	}
	
	public void display() {
		Node current = first;
		System.out.print("Stack: ");
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
}
