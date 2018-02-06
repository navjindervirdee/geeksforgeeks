/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
        if(head==null){
            return -1;
        }
	    int len = 0;
	    Node temp = head;
	    while(temp!=null){
	        len++;
	        temp = temp.next;
	    }
	    if(n>len){
	        return -1;
	    }
	    int k = len - n;
	    
	    temp = head;
	    while(k>0){
	        temp = temp.next;
	        k--;
	    }
	    return temp.data;
    }
}
	