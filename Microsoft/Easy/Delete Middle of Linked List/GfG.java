/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}*/
class GFG
{
   Node Delete(Node head)
   {
       if(head==null || head.next==null){
           return null;
       }
       
       Node temp = head;
       int i=0;
       while(temp!=null){
           i++;
           temp = temp.next;
       }
       temp = head;
       int till = i/2 - 1;
       i=0;
       while(till!=i){
           temp =temp.next;
           i++;
       }
       temp.next = temp.next.next;
       return head;
   }
}