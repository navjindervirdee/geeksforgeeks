/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
    Node add(Node temp, Node node){
        if(temp!=null){
            temp.next = node;
        }
        temp = node;
        return temp;
    }
    Node MergeLists(Node headA, Node headB) {
        if(headA==null){
            return headB;
        }
        if(headB==null){
            return headA;
        }
        Node sorted = null;
        Node temp = sorted;
        while(headA!=null && headB!=null){
            if(headA.data<headB.data){
                if(sorted==null){
                    sorted = headA;
                }
                temp = add(temp,headA);
                headA = headA.next;
            }
            else{
                if(sorted==null){
                    sorted = headB;
                }
                temp = add(temp,headB);
                headB = headB.next;
            }
        }
        
        if(headA==null){
            while(headB!=null){
                temp = add(temp,headB);
                headB = headB.next;
            }
        }
        else{
            while(headA!=null){
                temp = add(temp,headA);
                headA = headA.next;
            }
        }
        return sorted;
   } 
}