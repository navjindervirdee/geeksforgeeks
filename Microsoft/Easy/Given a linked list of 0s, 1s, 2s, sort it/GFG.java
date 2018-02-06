/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
class GFG
{
void linksort(Node head)
{
    int [] count_array = new int[3];
    count_array[0]=0;
    count_array[1]=0;
    count_array[2]=0;
    Node temp = head;
    while(temp!=null){
        count_array[temp.value]++;
        temp=temp.next;
    }
    
    temp=head;
    while(temp!=null){
        if(count_array[0]!=0){
            temp.value=0;
            temp=temp.next;
            count_array[0]--;
            continue;
        }
        if(count_array[1]!=0){
            temp.value=1;
            temp=temp.next;
            count_array[1]--;
            continue;
        }
        if(count_array[2]!=0){
            temp.value=2;
            temp=temp.next;
            count_array[2]--;
            continue;
        }
    }
    
    
   
}

}  