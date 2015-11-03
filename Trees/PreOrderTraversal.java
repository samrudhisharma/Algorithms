//Pre Order: <root><left><right>
//In - Order: <left><root><right>
//Post Order: <left><right><root>

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

//https://www.youtube.com/watch?v=gm8DUJJhmY4


void Preorder(Node root) {
    
    if(root== null) return;
    System.out.print(root.data+" ");
    Preorder(root.left);
    Preorder(root.right);

}
*/