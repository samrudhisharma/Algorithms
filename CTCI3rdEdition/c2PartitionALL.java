/*
public Node partition(Node n, int x)
{
	Node beforeStart = null;
	Node beforeEnd = null;
	Node afterStart = null;
	Node afterEnd = null;
	
	while(n != null)
	{
		Node next1 = n.next;
		n.next = null;
		
		if(n.data<x)
		{
			if(beforeStart==null)
			{
				beforeStart = n;
				beforeEnd = beforeStart;
			}
			else
			{
				beforeEnd.next = n;
				beforeEnd = n;
			}
		}
		else
		{
			if(afterstart == null)
			{
				afterStart = n;
				afterEnd = afterStart;
			}
			
			else
			{
				afterEnd.next = n;
				afterEnd = n;
			}
		}
		
		n = next1;
	}
	
	if(beforeStart == null)
			{return afterStart;}
	
	before.next = afterStart;
	return beforeStart;
}
*/