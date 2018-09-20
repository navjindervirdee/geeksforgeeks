/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
        int len = 0;
        Node temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        int mid = len/2;
        temp = head;
        for(int i=0;i<mid;i++){
            temp=temp.next;
        }
        return temp.data;
        
   }
}