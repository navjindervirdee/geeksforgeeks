/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node add(Node head, int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data>=node.data){
                break;
            }
            prev = temp;
            temp=temp.bottom;
        }
        if(prev==null){
            node.bottom = head;
            head = node;
        }
        else{
            Node bottom = prev.bottom;
            prev.bottom = node;
            node.bottom = bottom;
        }
        return head;
    }
    Node flatten(Node root){
        Node head = null;
        Node temp = root;
        while(temp!=null){
            head = add(head,temp.data);
            Node bottom = temp.bottom;
            while(bottom!=null){
                head = add(head,bottom.data);
                bottom = bottom.bottom;
            }
            temp = temp.next;
        }
        return head;
	
    }
}