/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
	/* Should return true if trees with roots as root1 and 
   root2 are identical else false */
    boolean isIdentical(Node root1, Node root2){
	    if(root1==null && root2==null){
	        return true;
	    }
	    if(root1==null && root2!=null){
	        return false;
	    }
	    if(root2==null && root1!=null){
	        return false;
	    }
	    
	    if(root1.data!=root2.data){
	        return false;
	    }
	    
	    boolean identical = isIdentical(root1.left,root2.left);
	    if(!identical){
	        return false;
	    }
	    identical = isIdentical(root1.right, root2.right);
	    if(identical){
	        return true;
	    }
	    else{
	        return false;
	    }
	    
	}
	
}