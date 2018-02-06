/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*
  Pairwise swap a linked list
  The input list will have at least one element  
  node is defined as 
  struct node
  {
     int data;
     struct node *next;
  }
*/
void pairWiseSwap(struct node *head)
{
    struct node *temp = head;
    while(temp!=NULL){
        if(temp->next==NULL){
            break;
        }
        struct node *next = temp->next;
        int tdata = temp->data;
        temp->data = next->data;
        next->data = tdata;
        temp = next->next;
    }
   // The task is to complete this method
}