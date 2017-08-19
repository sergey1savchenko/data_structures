package linkedList;

public class Test {
	
	public static void main(String[] args) {
		
		LinkList newList = new LinkList();
		
		newList.insert(10);
		newList.insert(20);
		newList.insert(20);
		newList.insert(40);
		newList.insert(30);
		
		newList.displayList();
		
		newList.delete(40);
		newList.delete(30);
		
		newList.displayList();
		
		newList.insert(30);
		
		newList.displayList();
		
		Node f = newList.find(20);
		
		if(f != null){
			System.out.println("We've found: " +f.data);
		}else{
			System.out.println("No such Node");
		}
	}
	
}