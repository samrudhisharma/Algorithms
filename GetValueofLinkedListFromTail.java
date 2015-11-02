/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
/*    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
   Node pr = head;
    if(head == null)
        {
        return 0;
    }
    else
        {
        Node curr = head;
        int len = 0;
        while(curr !=null)
            {
            curr = curr.next;
            len++;
        }
        
        int positionfromstart = len - n;
        int count12 = 0;
        
        while(count12<positionfromstart-1)
            {
            pr = pr.next;
            count12++;
        }
        
       
        
    }

    return pr.data;
}
*/