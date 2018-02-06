/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
       Node temp = head;
       int i=0;
       while(temp!=null){
           i++;
           temp=temp.next;
       }
       if(i%2!=0){
           temp=head;
           int till = i/2;
           i=0;
           while(i!=till){
               temp = temp.next;
               i++;
           }
           return temp.data;
       }
       int till = i/2;
       temp = head;
       i = 0;
       while(i!=till){
           temp =temp.next;
           i++;
       }
       return temp.data;
           
       
         // Your code here.
   }
}