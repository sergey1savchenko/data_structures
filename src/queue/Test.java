package queue;

public class Test {
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(100500);
		
		queue.display();
		
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
		
		queue.display();
		
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);

		try{
			queue.display();
			System.out.println(queue.dequeue().data);
		}catch(NullPointerException e){
			System.out.println("QUEUE IS ALREADY EMPTY!");
		}
		
	}
	
}