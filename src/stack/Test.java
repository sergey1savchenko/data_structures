package stack;

public class Test {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(100500);
		
		stack.display();
		
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		
		stack.display();
		
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);

		try{
			stack.display();
			System.out.println(stack.pop().data);
		}catch(NullPointerException e){
			System.out.println("STACK IS ALREADY EMPTY!");
		}
		
	}
	
}