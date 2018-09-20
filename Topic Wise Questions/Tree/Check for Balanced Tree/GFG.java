/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */
class GfG
{
    int checkHeight(Node root){
        if(root==null){
            return 0;
        }
        
        int leftH = checkHeight(root.left);
        if(leftH==Integer.MAX_VALUE){
            return leftH;
        }
        int rightH = checkHeight(root.right);
        if(rightH==Integer.MAX_VALUE){
            return rightH;
        }
        int diff = Math.abs(leftH-rightH);
        if(diff>=2){
            return Integer.MAX_VALUE;
        }
        else{
            return Math.max(leftH,rightH)+1;
        }
    }
    
     /* This function should return tree if passed  tree 
     is balanced, else false.  Time complexity should
     be O(n) where n is number of nodes in tree */
    boolean isBalanced(Node root){
	    if(root==null){
	        return true;
	    }
	    
	    int result = checkHeight(root);
	    
	    if(result!=Integer.MAX_VALUE){
	        return true;
	    }
	    else{
	        return false;
	    }
    }
}