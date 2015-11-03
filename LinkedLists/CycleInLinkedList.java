//http://stackoverflow.com/questions/2663115/how-to-detect-a-loop-in-a-linked-list

/*
 * 
 * 
 * /*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
/*
int HasCycle(Node head) {

    Node fast =  head;
  Node slow = head;
  
  while(fast != null)
      {
      slow = slow.next; //one hop
      fast = fast.next.next;
      
      if(slow == fast)
          return 1;
  }
    return 0;
}

 * 
 * */
 