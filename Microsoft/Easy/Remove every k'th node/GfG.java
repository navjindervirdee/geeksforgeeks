/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k){
        if(k==0){
            return head;
        }
        if(k==1){
            return null;
        }
        Node temp = head;
        Node prev = null;
        int i=1;
        while(temp!=null){
            if(i%k==0){
                prev.next = temp.next;
                temp = temp.next;
                i++;
                continue;
            }
            prev = temp;
            temp= temp.next;
            i++;
        }
        return head;
    }
}