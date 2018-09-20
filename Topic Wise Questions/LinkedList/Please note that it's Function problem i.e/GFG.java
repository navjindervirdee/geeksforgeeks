/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
  Sort the list of 0's,1's and 2's
  The input list will have at least one element  
  Node is defined as 
  class Node {
 int value;
  Node next;
  Node(int value) {
   this.value = value;
  }
}
*/
class GFG{
    void linksort(Node head){
        int [] count = new int[3];
        Node temp = head;
        while(temp!=null){
            int num = temp.value;
            count[num]++;
            temp = temp.next;
        }
        
        temp = head;
        int i = 0;
        while(temp!=null){
            if(count[i]==0){
                i++;
                continue;
            }
            temp.value = i;
            count[i]--;
            temp = temp.next;
        }
    }  
}