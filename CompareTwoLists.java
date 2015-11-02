/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
/*
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
    boolean result = false;
    if(headA == null || headB == null)
        {
       
    }
    else
        {
        
        Node curren1 = headA;
        int count = 0;
        Node curren2 = headB;
        int count1 = 0;
        
        while(curren1 != null)
           { 
            curren1 = curren1.next;
           count++;
           }
   
        while(curren2 !=null)
        {
        curren2 = curren2.next;
        count1++;
        }
    
        
       
           if(count == count1)
               {
            curren1 = headA;
            curren2 = headB;
               int check = 0;
            while(curren1 != null)
           { 
                if(curren1.data == curren2.data) {check++;}
            curren1 = curren1.next;
            curren2 = curren2.next;    
           }
               
               if(check == count1) {result = true;}
           }

        
    }
  
    if(result==true) return 1;
    else return 0;
}
*/