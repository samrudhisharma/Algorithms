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
void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    if(head == null || head.next == null)
        {
    
    }
    else
        {
      
        Node current = head;
        Node prev = null;
 
        Node next1;
        while(current != null)
        {
          next1 = current.next;
          current.next = prev;
          
          prev = current;
          current = next1;   
        }
        head = prev;
        
       while(head!=null){
        System.out.println(head.data);
        head=head.next;
    }
  
        
    }
    

}
*/