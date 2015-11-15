//Dependency: StackCheck -> Stack -> LinkedList
public class StackCheck {


	public static void main(String[] args) {
	
		Stack scheck = new Stack();
		scheck.push(123);
		scheck.push(23);
		scheck.push(3);
		System.out.println(scheck.pop());
		scheck.push(12345);
		scheck.push(1);
		System.out.println(scheck.peek());
		System.out.println(scheck.pop());
		System.out.println(scheck.peek());
	}

}
