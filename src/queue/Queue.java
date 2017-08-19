package queue;

public class Queue {

	Node first;
	Node last;

	public Queue() {
		first = null;
		last = null;
	}

	public Queue(Node a) {
		first = a;
		first.next = last;
		last = a;
		last.previous = first;
	}

	public void enqueue(int data) {						// Duplicates are welcome
		Node newLink = new Node(data);
		if (isEmpty()){
			first = newLink;
			first.next = last;
			last = newLink;
			last.previous = first;
		} else {
			newLink.next = first;
			first.previous = newLink;
			first = newLink;
		}
	}

	public Node dequeue() {
		if(!isEmpty()){									// If Queue is not empty
			if (first == last){							// If only one (FIRST) element remaining
				Node toReturn = new Node(first);
				first = null;
				return toReturn;
			}else {
				Node toReturn = new Node(last);
				last.previous.next = null;
				last = last.previous;
				return toReturn;
			}
		}else
			return null;
	}

	public boolean isEmpty(){
		if (first==null && last==null)
			return true;
		else
			return false;
	}

	public void display() {
		Node current = first;
		System.out.print("Queue: ");
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}

}