/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
/*
Node Reverse(Node head) {

    if(head==null || head.next == null)
        {
        return null;
    }
    else
        {
        
        Node current = head;
        Node prev = null;
        Node next1;
        
        while(current != null)
            {
            next1 = current.next; // Move a step ahead
            current.next = prev; // Point backwards
            
            prev = current;
            current = next1;
        }
        
        head = prev;
        
        return head;
    }
}
*/