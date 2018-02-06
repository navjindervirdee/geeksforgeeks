/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
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
    Node MergeLists(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        Node headC = null;
        Node tempC = null;
        
        while(tempA!=null && tempB!=null){
            if(tempA.data<tempB.data){
                if(tempC==null){
                    headC = tempA;
                    tempC = headC;
                }
                else{
                    tempC.next = tempA;
                    tempC = tempC.next;
                }
                tempA = tempA.next;
                continue;
            }
            
            if(tempA.data>tempB.data){
                if(tempC==null){
                    headC = tempB;
                    tempC = headC;
                }
                else{
                    tempC.next = tempB;
                    tempC = tempC.next;
                }
                tempB = tempB.next;
                continue;
            }
            if(tempA.data==tempB.data){
                if(headC==null){
                    headC = tempA;
                    tempC=headC;
                    tempA = tempA.next;
                    tempC.next = tempB;
                    tempC = tempC.next;
                }
                else{
                    tempC.next = tempA;
                    tempC = tempC.next;
                    tempA = tempA.next;
                    tempC.next = tempB;
                    tempC = tempC.next;
                }
                tempB = tempB.next;
                continue;
            }
        }
        if(tempA!=null){
            while(tempA!=null){
                tempC.next = tempA;
                tempA = tempA.next;
                tempC = tempC.next;
            }
        }
        else{
            while(tempB!=null){
                tempC.next = tempB;
                tempB = tempB.next;
                tempC = tempC.next;
            }
        }
        tempC.next = null;
        return headC;
     // This is a "method-only" submission. 
     // You only need to complete this method
   } 
}