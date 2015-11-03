/*
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
/*
Node InsertNth(Node head, int data, int position) {
    
    Node newNode = new Node();
    newNode.data = data;
    
    if(position==0 && head==null)
        {
        newNode.next = null;
        head = newNode;
        return head;
    }
    else if(position ==0  && head != null)
        {
        newNode.next = head;
        return newNode;
    }
    else
        {
        
        Node current = head;
        int count = 0;
       
        while(count<position-1 && current.next != null)
            {
            current = current.next;
            count++;
        }
        
        Node temp = current.next; // This pointer will be changed, so we better store it.
        current.next = newNode;
        newNode.next = temp;
        
        
        
        return head;
    }

}
*/