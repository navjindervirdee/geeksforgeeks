/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
    int findHeight(Node root){
        if(root == null){
            return 0;
        }
        if(root.right==null && root.left==null){
            return 1;
        }
        
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        
        if(right == -1 || left==-1){
            return -1;
        }
        int diff = Math.abs(left-right);
        if(diff>1){
            return -1;
        }
        
        return Math.max(left,right) + 1;
    }
    
     /* This function should return tree if passed  tree 
     is balanced, else false.  Time complexity should
     be O(n) where n is number of nodes in tree */
    boolean isBalanced(Node root)
    {
        int answer = findHeight(root);
        if(answer==-1){
            return false;
        }
        return true;
    }
}