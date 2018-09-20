/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
	Node addTwoLists(Node first, Node second){
	   int carry  = 0;
	   Node head = new Node(-1);
	   Node temp = head;
	   while(first!=null && second!=null){
	       int sum = first.data + second.data + carry;
	       int rem = sum%10;
	       int quo = sum/10;
	       first.data = rem;
	       carry = quo;
	       temp.next = first;
	       temp = temp.next;
	       first = first.next;
	       second = second.next;
	   }
	   
	   if(first==null){
	       while(second!=null){
	           int sum = second.data + carry;
	           int rem = sum%10;
	           int quo = sum/10;
	           second.data = rem;
	           temp.next  = second;
	           second = second.next;
	           temp = temp.next;
	           carry = quo;
	       }
	   }
	   else{
	       while(first!=null){
	           int sum = first.data + carry;
	           int rem = sum%10;
	           carry = sum/10;
	           first.data = rem;
	           temp.next = first;
	           first = first.next;
	           temp = temp.next;
	       }
	   }
	   if(carry!=0){
	       Node node = new Node(carry);
	       temp.next = node;
	   }
	   return head.next;
	}
}