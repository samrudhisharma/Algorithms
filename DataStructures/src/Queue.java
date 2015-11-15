public class Queue {
	
	LinkedList first, last;

	void enqueue(Object data)
	{
		if(first == null)
		{
			last = new LinkedList();
			last.data = data;
			first = last;
		}
		else
		{
			last.next = new LinkedList();
			last.next.data = data;
			last = last.next;
		}
	}
	
	Object dequeue()
	{
		if(first!=null)
		{
			Object store = first.data;
			first = first.next;
			
				if(first == null)
						last = null;
					
			return store;
		}
		return null;
	}
	
	boolean isEmpty()
	{
		if(first == null && last == null)
			return true;
		
		return false;
	}

}
