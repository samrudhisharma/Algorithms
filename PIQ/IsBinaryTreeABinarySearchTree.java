import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;
}


public class IsBinaryTreeABinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	}
	
	public static boolean isBinarySearchTree(Node root){
		
		if(root==null) return true;
		
		if(isSubtreeLesser(root.left,root.data) && isSubtreeGreater(root.right,root.data) && isBinarySearchTree(root.left) && isBinarySearchTree(root.right))
		{return true;}
		else
		return false;
	}
	
	public static boolean isSubtreeLesser(Node root, int value)
	{
		if(root==null) return true;
		
		if(root.data<= value && isSubtreeLesser(root.left, value) && isSubtreeGreater(root.right, value))
		{
			return true;
		}
		else
		return false;
	}
	
	public static boolean isSubtreeGreater(Node root, int value)
	{
		if(root==null) return true;
		
		if(root.data > value && isSubtreeLesser(root.left, value) && isSubtreeGreater(root.right, value))
		{
			return true;
		}
		else
		return false;
	}

}
