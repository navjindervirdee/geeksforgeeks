/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/
// This function should convert a given Binary tree to Doubly
// Linked List
// root --> Root of Binary Tree
// head --> head of created doubly linked list
class GfG
{
     Node head;
     Node inOrder(Node root, Node prev){
        if(root==null){
            return prev;
        }
        prev = inOrder(root.left,prev);
        if(prev==null){
            head = root;
            prev = head;
        }
        
        else{
            root.left = prev;
            prev.right = root;
            prev = root;
        }
        prev = inOrder(root.right,prev);
        return prev;
    }
    
     Node BToDLL(Node root){
        Node prev = null;
	    inOrder(root,prev);
	    return head;
    }
}