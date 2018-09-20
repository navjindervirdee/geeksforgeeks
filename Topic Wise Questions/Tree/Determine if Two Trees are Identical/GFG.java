/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
		if(root1!=null && root2==null){
		    return false;
		}
		
		if(root1.data!=root2.data){
		    return false;
		}
		
		boolean left = isIdentical(root1.left,root2.left);
		if(left){
		    left = isIdentical(root1.right, root2.right);
		}
		return left;
		
	}
	
}