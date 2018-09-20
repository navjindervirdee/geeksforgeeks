/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */
class GfG
{
    Node mergeResult(Node node1, Node node2){
	    Node head3 = new Node(-1);
	    Node temp = head3;
	    
	    while(node1!=null && node2!=null){
	        if(node1.data<=node2.data){
	            temp.next = node1;
	            temp = temp.next;
	            node1 = node1.next;
	            continue;
	        }
	        if(node2.data<node1.data){
	            temp.next = node2;
	            temp = temp.next;
	            node2 = node2.next;
	            continue;
	        }
	    }
	    
	    if(node1==null){
	        while(node2!=null){
	            temp.next = node2;
	            node2 = node2.next;
	            temp = temp.next;
	        }
	    }
	    else{
	        while(node1!=null){
	            temp.next = node1;
	            temp =temp.next;
	            node1 = node1.next;
	        }
	    }
	    
	    head3  = head3.next;
	    Node prev = null;
	    temp = head3;
	    while(temp!=null){
	        Node next = temp.next;
	        temp.next = prev;
	        prev = temp;
	        temp = next;
	    }
	    
	    head3 = prev;
	    return head3;
    }
}