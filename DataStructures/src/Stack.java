
public class Stack {

	LinkedList top;
	
	void push(Object data)
	{
		LinkedList insert = new LinkedList();
		insert.data = data;
		insert.next = top;
		top = insert;
		
	}
	
	Object pop()
	{
		if(top.data != null)
		{
			Object show = top.data;
			top = top.next;
			return show;
		}
		return null;
	}
	
	Object peek()
	{
		if(top.data != null)
		{   
			return top.data;
			 
		}
		return null;
	}
	

}
