/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
    
    void inOrder(Node node, List<Node> list){
        if(node==null){
            return;
        }
        inOrder(node.left,list);
        list.add(node);
        inOrder(node.right,list);
    }
    
    Node BToDLL(Node root){
        if(root==null){
            return root;
        }
	    List<Node> list = new ArrayList<Node>();
	    inOrder(root,list);
	    Node prev = null;
	    for(int i=0;i<list.size()-1;i++){
	        Node curr = list.get(i);
	        Node next = list.get(i+1);
	        curr.right = next;
	        curr.left  = prev;
	        prev = curr;
	    }
	    head = list.get(0);
	    list.get(list.size()-1).left = prev;
	    list.get(list.size()-1).right = null;
	    return head;
	}
}