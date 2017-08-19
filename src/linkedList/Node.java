package linkedList;

public class Node {
	
	public Integer data; 							// info
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public void displayNode() {
		System.out.print(" {" + data + "}");
	}
	
}