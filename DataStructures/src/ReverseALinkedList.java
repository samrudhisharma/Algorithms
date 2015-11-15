//Dependency: ReverseALinkedList -> LinkedList
public class ReverseALinkedList {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6};
		LinkedList head = new LinkedList();
		head.data = arr[0];
		LinkedList temp;
		temp = head;
		for(int i=0;i<arr.length;i++)
		{
			temp.next = new LinkedList();
			temp.data = arr[i];
			temp = temp.next;
		}
		
		printLinkedList(reverseLinkedList(head));

	}
	
	static LinkedList reverseLinkedList(LinkedList ll)
	{
		LinkedList prev = null;
		LinkedList temp;
		while(ll!=null)
		{
			temp = ll.next;
			ll.next = prev;
			prev = ll;
			ll = temp;
		}
		
		return prev;
	}
	
	static void printLinkedList(LinkedList ll)
	{
		while(ll!=null)
		{
			System.out.println(ll.data);
			ll = ll.next;
		}
	}

}
