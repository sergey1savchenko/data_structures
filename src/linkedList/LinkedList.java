package linkedList;

class LinkList {
	
	Node first;

	public LinkList() {
		first = null;
	}

	public LinkList(Node a) {
		first = a;
	}

	public void insert(int data) {						// Let's add only unique Nodes in the beginning 
		Node newLink = new Node(data); 					// new Node
		if (isEmpty()){									// If List is empty ===> there definitely no such Node
			newLink.next = first; 						// pointing "first" element makes it second
			first = newLink; 							// now new Node is first
		}else if (find(data)==null){					// If List is not empty but there still no such Node
			newLink.next = first;
			first = newLink;
		}
		/* If we want to store duplicates
		 * Link newLink = new Link(data);
		 * newLink.next = first;
		 * first = newLink;
		 */
	}

	public Node find(int key) { 						// Find item with specified key
		Node current = first; 							// from the first item
		while (!current.data.equals(key)) { 			// key is not found..
			if (current.next == null) { 				// and it is the end of List
				return null; 
			} else {
				current = current.next; 				// or go to the next Node and look for the key
			}
		}
		return current;
	}

	public void delete(int key) { 						// Delete an item by a given key
		Node current;
		if(first.data.equals(key)){						// If the item is the first in the list
			first = first.next;
		}else{											// If somewhere inside or last
			current = first;
		    while (current.next != null) {
		        if (current.next.data.equals(key)) {
		        	current.next = current.next.next;
		            break;
		        } else {
		        	current = current.next;
		        }
		    }
		}
	}
	
	public boolean isEmpty(){
	    if (first==null)
	        return true;
	    else
	        return false;
	}
	
	public void displayList() {
		Node current = first;
		System.out.print("List (first --> last): ");
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
}