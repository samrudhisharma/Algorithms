/*
void deleteDups(Node head)
{
	HashSet<Integer> set = new HashSet<Integer>();
	
	if(head == null)
	{
		//throw Exception, error message
	}
	else
	{
		Node current = head.next;
		Node prev = head;
		while(current != null)
		{
			if(set.contains(current.data))
			{
				prev.next = current.next;
			}
			else
			{
				set.add(n.data);
				prev = current;
			}
			
			current = current.next;
		}
	}
	
}
*/
 