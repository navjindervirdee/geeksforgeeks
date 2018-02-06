/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class GfG
{
	Node addTwoLists(Node first, Node second)
	{
	    Node temp1 = first;
	    Node temp2 = second;
	    Node head3 = null;
	    Node temp3 = null;
	    int carry = 0;
	    while(temp1!=null && temp2!=null){
	        int sum = temp1.data + temp2.data + carry;
	        carry = sum/10;
	        sum = sum%10;
	        Node node = new Node(sum);
	        if(temp3==null){
	            head3 = node;
	            temp3 = head3;
	        }
	        else{
	            temp3.next = node;
	            temp3 = temp3.next;
	        }
	        temp1 = temp1.next;
	        temp2 = temp2.next;
	    }
	    
	    if(temp1==null){
	        while(temp2!=null){
	            int sum = carry + temp2.data;
	            Node node = new Node(sum%10);
	            carry = sum/10;
	            temp3.next = node;
	            temp3 = temp3.next;
	            temp2 = temp2.next;
	        }
	    }
	    else{
	        while(temp1!=null){
	            int sum = carry + temp1.data;
	            Node node = new Node(sum%10);
	            carry = sum/10;
	            temp3.next = node;
	            temp3 = temp3.next;
	            temp1 = temp1.next;
	        }
	    }
	    if(carry!=0){
	        Node node = new Node(carry);
	        temp3.next = node;
	        temp3=temp3.next;
	    }
	    return head3;
	}
}