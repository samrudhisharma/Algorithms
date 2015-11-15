//Dependency: ReverseALinkedList -> LinkedList
public class ReverseALinkedList {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6};
		LinkedList ll = new LinkedList();
		
		
		for(int i=0;i<arr.length;i++)
		{
			ll.data = arr[i];
			ll = ll.next;
		}
		
		printLinkedList(ll);

	}
	
	static void reverseLinkedList()
	{
		
	}
	
	static void printLinkedList(LinkedList ll)
	{
	
	}

}
