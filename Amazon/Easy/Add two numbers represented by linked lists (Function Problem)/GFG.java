/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
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
	Node addTwoLists(Node first, Node second){
	   Node temp = first;
	   int carry = 0;
	   Node prev = null;
	   while(temp!=null && second!=null){
	       int sum = temp.data + second.data + carry;
	       temp.data = sum%10;
	       carry = sum/10;
	       prev = temp;
	       temp = temp.next;
	       second = second.next;
	   }
	   
	   if(temp==null){
	       while(second!=null){
	           int sum = carry + second.data;
	           second.data = sum%10;
	           carry = sum/10;
	           prev.next = second;
	           prev = second;
	           second = second.next;
	       }
	       if(carry!=0){
	         Node node = new Node(carry);
	         prev.next = node;
	       }
	   }
	   else{
	       while(temp!=null){
	           int sum = carry + temp.data;
	           temp.data = sum%10;
	           carry = sum/10;
	           prev = temp;
	           temp = temp.next;
	       }
	       if(carry!=0){
	         Node node = new Node(carry);
	         prev.next = node;
	       }
	   }
	   
	   return first;
	}
}