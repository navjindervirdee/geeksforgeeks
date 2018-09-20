/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
class GfG
{
    int getNthFromLast(Node head, int n){
	    Node temp = head;
	    int len =0;
	    
	    while(temp!=null){
	        temp = temp.next;
	        len++;
	    }
	    
	    int index = len - n;
	    int i = 0;
	    temp = head;
	    while(i<index){
	        temp = temp.next;
	        i++;
	    }
	    return temp.data;
    }
}