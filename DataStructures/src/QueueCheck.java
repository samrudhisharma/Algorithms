//Dependency: QueueCheck -> Queue -> LinkedList
public class QueueCheck {

	public static void main(String[] args) {
		
		Queue qcheck = new Queue();
		
		System.out.println(qcheck.isEmpty());
		qcheck.enqueue(1234);
		System.out.println(qcheck.dequeue());
		qcheck.enqueue(123);
		qcheck.enqueue(123456);
		qcheck.enqueue(1234232);
		System.out.println(qcheck.dequeue());
		System.out.println(qcheck.dequeue());
		System.out.println(qcheck.dequeue());
		System.out.println(qcheck.isEmpty());
	}

}
