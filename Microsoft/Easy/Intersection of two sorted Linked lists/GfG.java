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
 class for LinkedList creation
class Intersect
{
    Node head;  // head of list
   
}
This is method only submission.  You only need to complete the method. */
class GfG
{
    Intersect llist3 = new Intersect(); // object of LinkedList having Intersection of two LinkedLists
    // Function  to find Intersection of two LinkedLists
    void getIntersection(Node head1, Node head2)
    {   
         if(head1==null){
             llist3.head = head2;
         }
         if(head2==null){
             llist3.head = head1;
         }
         
         Node temp1 = head1;
         Node temp2 = head2;
         Node temp3 = null;
         while(temp1!=null && temp2!=null){
             //System.out.println(temp1.data + " " + temp2.data);
             if(temp1.data == temp2.data){
                 Node node = new Node(temp1.data);
                 temp1 = temp1.next;
                 temp2 = temp2.next;
                 if(temp3 == null){
                     llist3.head = node;
                     temp3 = llist3.head;
                 }
                 else{
                    temp3.next = node;
                    temp3 = temp3.next;
                 }
                 continue;
             }
             
             if(temp1.data<temp2.data){
                 temp1 = temp1.next;
             }
             else{
                 temp2 = temp2.next;
             }
         }
    }
}