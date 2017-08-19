package queue;

public class Node {
	
	public Integer data; 							// info
	public Node next;
	public Node previous;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public Node(Node inp) {
		this.data = inp.data;
		this.next = inp.next;
		this.previous = inp.previous;
	}

	public void displayNode() {
		System.out.print(" {" + data + "}");
	}
	
}