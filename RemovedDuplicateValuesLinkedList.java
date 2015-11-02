/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
/*
Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head == null)
        {
        
    }
    else
        {
        Node curr = head.next;
        Node prev = head;
        
        while(curr != null)
            {
            if(curr.data==prev.data)
                {
                Node temp = curr.next;
                prev.next = temp;
                curr.next = null;
                curr = temp;
            }
            else
                {
                curr = curr.next;
                prev = prev.next;
            }
        }
        
        
    }

    return head;
}
*/