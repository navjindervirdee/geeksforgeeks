/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
class gfg
{
    Node MergeLists(Node headA, Node headB) {
        Node head = new Node(-1);
        Node temp = head;
        
        while(headA!=null && headB!=null){
            if(headA.data<=headB.data){
                temp.next = headA;
                headA = headA.next;
            }
            else{
                temp.next = headB;
                headB = headB.next;
            }
            temp = temp.next;
        }
        
        if(headA==null){
            while(headB!=null){
                temp.next = headB;
                headB = headB.next;
                temp = temp.next;
            }
        }
        else{
            while(headA!=null){
                temp.next = headA;
                headA = headA.next;
                temp = temp.next;
            }
        }
        return head.next;
    } 
}