package stack;

public class Node {
	
	public Integer data; 							// info
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(Node inp) {
		this.data = inp.data;
		this.next = inp.next;
	}

	public void displayNode() {
		System.out.print(" {" + data + "}");
	}
	
}
